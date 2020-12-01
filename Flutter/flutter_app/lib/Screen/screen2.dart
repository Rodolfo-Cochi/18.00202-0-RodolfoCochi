import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class Screen2 extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        resizeToAvoidBottomInset: false,
        resizeToAvoidBottomPadding: false,
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
              "https://www.teahub.io/photos/full/68-682392_28-04-2018-pokemon-sun-and-moon-wallpaper.jpg",
              fit: BoxFit.cover,
              alignment: Alignment.center,
            ),
            Image.network(
              "https://static.quizur.com/i/b/57c1c26fc0b812.5998420157c1c26fb156c9.51498011.png",
              fit: BoxFit.cover,
              alignment: Alignment.center,
            ),
            new Positioned(
              left: 40.0,
              bottom: 330.0,
              height: 60,
              width: 330,
              child: ElevatedButton(
                onPressed: null,
                child: Text(
                  "Pokémon 1",
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                    fontSize: 35.0,
                    color: Colors.black,
                  ),
                ),
              ),
            ),

            // SEGUNDO BOTAO
            Positioned(
              left: 40.0,
              bottom: 250.0,
              height: 60,
              width: 330,
              child: ElevatedButton(
                onPressed: null,
                child: Text(
                  "Pokémon 2",
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                    fontSize: 35.0,
                    color: Colors.black,
                  ),
                ),
              ),
            ),

            // TERCEIRO BOTAO
            Positioned(
              left: 40.0,
              bottom: 170.0,
              height: 60,
              width: 330,
              child: ElevatedButton(
                onPressed: null,
                child: Text(
                  "Pokémon 3",
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                    fontSize: 35.0,
                    color: Colors.black,
                  ),
                ),
              ),
            ),

            // QUARTO BOTAO
            Positioned(
              left: 40.0,
              bottom: 90.0,
              height: 60,
              width: 330,
              child: ElevatedButton(
                onPressed: null,
                child: Text(
                  "Pokémon 4",
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                    fontSize: 35.0,
                    color: Colors.black,
                  ),
                ),
              ),
            ),
          ],
        )));
  }
}
