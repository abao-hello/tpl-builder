package config

// lang type
const (
	Java = iota
	Csharp
	Cpp
	GoLang
	Lua
)

// args type
const (
	Lang = "-l"
	Out  = "-o"
	In   = "-i"
	Tpl  = "-t"
	Help = "-help"
)

const (
	Argc = 4
)
