import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_app/models/pokemon.dart';
import 'package:flutter_app/Screen/screen2.dart';
import 'package:flutter_app/utilities/network_helper.dart';
import 'dart:math';

class Screen4 extends StatelessWidget {
  Random random = new Random();
  Pokemon_Obj pokemon = new Pokemon_Obj();

  Future FetchPoke() async {
    var requisicao = NetworkHelper(
        url: "https://pokeapi.co/api/v2/pokemon-form/${random.nextInt(900)}");
    pokemon = Pokemon_Obj.fromJson(await requisicao.getData());
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          centerTitle: true,
          title: const Text(
            "Poke Guesser",
            style: TextStyle(fontFamily: "Pokemon"),
          ),
        ),
        body: SingleChildScrollView(
            child: Stack(
              children: [
                Image.network(
                  "https://i.pinimg.com/originals/35/df/b7/35dfb7733aadb9730852f0ad5833694c.png",
                  fit: BoxFit.cover,
                  alignment: Alignment.center,
                ),
                new Positioned(
                  left: 100.0,
                  bottom: 150.0,
                  width: 200.0,
                  child: new ElevatedButton(
                    onPressed: () async {
                      await FetchPoke();
                      Navigator.push(
                        context,
                        MaterialPageRoute(builder: (context) => Screen2(poke: pokemon)),
                      );
                    },
                    child: Text(
                      "Play Again!",
                      style: new TextStyle(fontFamily: "Pokemon", fontSize: 30.0),
                    ),
                  ),
                ),
                Positioned(
                    left: 100.0,
                    bottom: 50.0,
                    width: 200.0,
                    child: new ElevatedButton(
                        onPressed: () {
                          SystemNavigator.pop();
                        },
                        child: Text(
                          "Exit !",
                          style:
                          new TextStyle(fontFamily: "Pokemon", fontSize: 30.0),
                        )))
              ],
            )));
  }
}
