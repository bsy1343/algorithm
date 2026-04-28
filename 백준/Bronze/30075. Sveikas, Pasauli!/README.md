# [Bronze II] Sveikas, Pasauli! - 30075

[문제 링크](https://www.acmicpc.net/problem/30075)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 102, 정답: 73, 맞힌 사람: 62, 정답 비율: 73.810%

### 분류

구현, 문자열

### 문제 설명

<p>Paulius sukonstravo mini kompiuterį, prie kurio prijungtas ekranas bus pakabintas gerai matomoje vietoje ir rodys draugų žinutes i&scaron; socialinių tinklų.</p>

<p>Dabar vaikinas programuoja i&scaron;vedimo į ekraną komandą SPAUSDINTI, kuri turi ekrane parodyti pateiktą tekstą ir suprasti vieną specialią instrukciją \n &ndash; tęsti i&scaron; naujos eilutės.</p>

<p><em>Komandos</em> SPAUSDINTI <em>sintaksė</em>. Komanda pradedama didžiosiomis raidėmis užra&scaron;ytu raktažodžiu SPAUSDINTI. Po vieno tarpo pateikiamas kabutėmis (&quot;) apgaubtas tekstas, kurį reikia i&scaron;vesti į ekraną. Kabučių i&scaron;vesti nereikia.</p>

<p>I&scaron;vedamame tekste gali būti tokių simbolių:</p>

<ul>
	<li>lotyni&scaron;kų didžiųjų ir mažųjų raidžių;</li>
	<li>skaičių;</li>
	<li>, ./ &lt;&gt;?; : []{}|()&minus; = _ + @! &lowast; %$&amp;#</li>
</ul>

<p>Tarpų i&scaron;vedamame tekste nebus. Jei tarp kabučių yra naujos eilutės komanda (du i&scaron; eilės einantys simboliai \n), &scaron;ie simboliai nėra i&scaron;vedami, o suprantami kaip instrukcija tolimesnį tekstą i&scaron;vesti naujoje eilutėje.</p>

<p>Komanda SPAUSDINTI i&scaron;veda tekstą į tą pačią eilutę, kur baigė prie&scaron; tai vykdyta komanda, ir tik \n instrukcija nurodo, kad reikia tęsti naujoje eilutėje.</p>

<p>Pateikta programa sudaryta tik i&scaron; komandų SPAUSDINTI. Para&scaron;ykite programą, kuri interpretuotų pateiktas komandas ir i&scaron;vestų jų rezultatą.</p>

### 입력

<p>Pirmojoje pradinių duomenų eilutėje nurodytas programą sudarančių komandų SPAUSDINTI skaičius $N$. Kitose $N$ eilučių pateiktos komandos po vieną eilutėje. Programa yra sintaksi&scaron;kai teisinga ir jos eilutės yra neilgesnės nei $250$ simbolių.</p>

### 출력

<p>I&scaron;veskite tekstą, kurį atspausdintų duotoji programa.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 1000$</li>
</ul>