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
  Pokemon_Obj pokemon1 = new Pokemon_Obj();
  Pokemon_Obj pokemon2 = new Pokemon_Obj();
  Pokemon_Obj pokemon3 = new Pokemon_Obj();

  Future FetchPoke() async {
    var requisicao = NetworkHelper(
        url: "https://pokeapi.co/api/v2/pokemon-form/${random.nextInt(900)}");
    pokemon = Pokemon_Obj.fromJson(await requisicao.getData());
    var requisicao2 =
    NetworkHelper(url: "https://pokeapi.co/api/v2/pokemon-form/${random.nextInt(895)}");
    pokemon1 = Pokemon_Obj.fromJson(await requisicao2.getData());
    var requisicao3 =
    NetworkHelper(url: "https://pokeapi.co/api/v2/pokemon-form/${random.nextInt(895)}");
    pokemon2 = Pokemon_Obj.fromJson(await requisicao3.getData());
    var requisicao4 =
    NetworkHelper(url: "https://pokeapi.co/api/v2/pokemon-form/${random.nextInt(895)}");
    pokemon3 = Pokemon_Obj.fromJson(await requisicao4.getData());

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
                        MaterialPageRoute(builder: (context) => Screen2(poke: pokemon, poke1: pokemon1, poke2: pokemon2,)),
                      );
                    },
                    child: Text(
                      "Try Again !",
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
                        ))),
                Positioned(
                    left: 20.0,
                    bottom: 500.0,
                    child: Text("Oops try agay !",
                        style:
                        new TextStyle(fontFamily: "Pokemon", fontSize: 45.0)))
              ],
            )));
  }
}
