import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class Screen1 extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          centerTitle: true,
          title: const Text("Poke Guesser"),
        ),
        body: SingleChildScrollView(
            child: Stack(
          children: [
            Image.network("https://wallpapercave.com/wp/wp2609505.png",
            fit: BoxFit.cover,
            alignment: Alignment.center,
            ),
            new Positioned(
                left: 100.0,
                bottom: 150.0,
                width: 200.0,
                child: new ElevatedButton(onPressed: null, child: Text("Play !",
                style: new TextStyle(
                  fontSize: 50.0
                ),)))

          ],
        )));
  }
}
