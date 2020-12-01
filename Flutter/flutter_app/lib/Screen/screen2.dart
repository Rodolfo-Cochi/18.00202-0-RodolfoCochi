import 'dart:math';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter_app/Screen/screen3.dart';
import 'package:flutter_app/Screen/screen4.dart';
import 'package:flutter_app/models/pokemon.dart';
import 'package:flutter_app/utilities/network_helper.dart';

class Screen2 extends StatefulWidget {
  final Pokemon_Obj poke;

  const Screen2({Key key, @required this.poke}) : super(key: key);

  @override
  _Screen2State createState() => _Screen2State();
}


class _Screen2State extends State<Screen2> {
  bool hasbeenPressed = false;

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
        Positioned(
          left: 30.0,
          top: 110.0,
          child: Image.network(
            widget.poke.sprites.frontDefault,
            fit: BoxFit.cover,
            alignment: Alignment.center,
          ),
        ),

        Positioned(
          left: 40.0,
          bottom: 330.0,
          height: 60,
          width: 330,
          child: ElevatedButton(
            onPressed: () {
              Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => Screen3()),
              );
              setState(() {
                hasbeenPressed = !hasbeenPressed;
              });
            },
            child: Text(
            widget.poke.name,
            style: TextStyle(
              fontWeight: FontWeight.bold,
              fontSize: 35.0,
              color: Colors.black,
            ),
          ),
        ),
      ),

      Positioned(
        left: 40.0,
        bottom: 250.0,
        height: 60,
        width: 330,
        child: ElevatedButton(
          onPressed: () {
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Screen4()),
            );
            setState(() {
              hasbeenPressed = !hasbeenPressed;
            });
          },
          child: Text(
            "Ratata",
            style: TextStyle(
              fontWeight: FontWeight.bold,
              fontSize: 35.0,
              color: Colors.black,
            ),
          ),
        ),
      ),

      Positioned(
        left: 40.0,
        bottom: 170.0,
        height: 60,
        width: 330,
        child: ElevatedButton(
          onPressed: () {
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Screen4()),
            );
            setState(() {
              hasbeenPressed = !hasbeenPressed;
            });
          },
          child: Text(
            "Geodude",
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
