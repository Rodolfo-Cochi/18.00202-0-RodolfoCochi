
class Pokemon{
  var _nome;
  var _foto;

  Pokemon(this._nome, this._foto);

  @override
  String toString() {
    return 'Pokemon{_nome: $_nome, _foto: $_foto}';
  }

  get foto => _foto;

  get nome => _nome;
}