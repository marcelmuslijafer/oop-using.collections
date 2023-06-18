# Pravila za korištenje Javinih kolekcija s vlastitim klasama

1. Uvijek overrideaj metodu equals
2. Uvijek overrideaj metodu hashCode (kad overrideas equals, overrideaj i hashCode, i obrnuto)
3. Ako koristimo TreeSet ili TreeMap (ili bilo koju kolekciju u kojoj zelimo imati sortirane elemente)
   implementirati ili Comparable ili Comparator
