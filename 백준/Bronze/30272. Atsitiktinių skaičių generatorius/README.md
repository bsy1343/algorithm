# [Bronze II] Atsitiktinių skaičių generatorius - 30272

[문제 링크](https://www.acmicpc.net/problem/30272)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 184, 정답: 136, 맞힌 사람: 110, 정답 비율: 72.368%

### 분류

구현, 문자열, 많은 조건 분기

### 문제 설명

<p>Justas nusipirko atsitiktinių skaičių generatorių, kuris gali sugeneruoti bet kokį teigiamą sveikąjį skaičių su lygiai N skaitmenų. Deja, generatoriaus ekranas yra labai mažas ir sugeneruotas skaičius į jį netelpa. Todėl &scaron;is skaičius yra i&scaron;vedamas paeiliui parodant jo skaitmenis.</p>

<p>Kiekvieno skaitmens atvaizdas yra 9 &times; 8 matmenų paveikslėlis, sudarytas i&scaron; baltų ir juodų pikselių. Jei baltus pikselius vaizduotume ta&scaron;kais (<code>.</code>), o juodus &ndash; grotelėmis (<code>#</code>), tai skaitmenys atrodytų taip:</p>

<pre style="text-align: center;">
..#####..  ....##...  .#######.  .#######.  ##.......
.##...##.  ..####...  ##.....##  ##.....##  ##....##.
##.....##  ....##...  .......##  .......##  ##....##.
##.....##  ....##...  .#######.  .#######.  ##....##.
##.....##  ....##...  ##.......  .......##  #########
.##...##.  ....##...  ##.......  ##.....##  ......##.
..#####..  ..######.  #########  .#######.  ......##.
.........  .........  .........  .........  .........
.########  .#######.  .########  .#######.  .#######.
.##......  ##.....##  .##....##  ##.....##  ##.....##
.##......  ##.......  .....##..  ##.....##  ##.....##
.#######.  ########.  ....##...  .#######.  .########
.......##  ##.....##  ...##....  ##.....##  .......##
.##....##  ##.....##  ...##....  ##.....##  ##.....##
..######.  .#######.  ...##....  .#######.  .#######.
.........  .........  .........  .........  .........
</pre>

<p>Gavę N skaitmenų, atvaizduotų auk&scaron;čiau nurodytu būdu, apskaičiuokite, kokį skaičių tie skaitmenys sudaro. Skaitmenys bus pateikiami paeiliui nuo kairiausio iki de&scaron;iniausio.</p>

### 입력

<p>Pirmojoje eilutėje pateikiamas skaitmenų kiekis N. Toliau pateikiama 8N eilučių, apra&scaron;ančių skaitmenis (vieną skaitmenį apra&scaron;o a&scaron;tuonios eilutės). Kiekvieną eilutę sudaro devyni simboliai (<code>.</code> ir <code>#</code>).</p>

<p>Pirmasis skaitmuo nebus nulis.</p>

### 출력

<p>I&scaron;veskite skaičių, kuris susidaro i&scaron; pateiktų skaitmenų</p>

### 제한

<ul>
	<li>1 &le; N &le; 5120</li>
</ul>