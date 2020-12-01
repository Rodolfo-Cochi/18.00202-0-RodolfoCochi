import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_app/Screen/screen2.dart';

class Screen1 extends StatelessWidget {
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
              "https://wallpapercave.com/wp/wp2609505.png",
              fit: BoxFit.cover,
              alignment: Alignment.center,
            ),
            new Positioned(
              left: 100.0,
              bottom: 150.0,
              width: 200.0,
              child: new ElevatedButton(
                onPressed: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(builder: (context) => Screen2()),
                  );
                },
                child: Text(
                  "Play !",
                  style: new TextStyle(fontFamily: "Pokemon", fontSize: 50.0),
                ),
              ),
            ),
            Positioned(
                left: 100.0,
                bottom: 50.0,
                width: 200.0,
                child: new ElevatedButton(
                    onPressed: (){
                      SystemNavigator.pop();
                    },

                    child: Text(
                      "Exit !",
                      style:
                          new TextStyle(fontFamily: "Pokemon", fontSize: 50.0),
                    )))
          ],
        )));
  }
}
