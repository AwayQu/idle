# Parser

> save code info

# identify type

1. full link identify (unique identify)
2. absolutely link identify (may not unique)

> if find full link identify then replace absolutely link identify

> use identify to find and expand code info

$PATH(name|identify)$
$FILE(name|identify)$
$CLASS(name|identify)$
$FUNCTION(name|identify)$
$VARIABLE(name|identify)$


## path

owner (path) -> identify

path  -> path string

### format

owner (path)  -> identify 
path 		  -> path string



## file

owner (path) -> identify

name 		 -> file name string



## class

owner (file) -> identify

supercls -> `[absolutely idenitfy]`

function -> `[full link identify] string` 

variable -> `[full link identify] string`

## variable

owner (file, class) -> identify

name  -> string 

type -> type of variable




## TODO

 [x] encode and decode objects [finish]

 [x] find and aggregate info 
    [ x ] aggregate different class
    [ x ] search info with full identify