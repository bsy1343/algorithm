# [Silver IV] Robotai - 30057

[문제 링크](https://www.acmicpc.net/problem/30057)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 98, 정답: 67, 맞힌 사람: 27, 정답 비율: 56.250%

### 분류

브루트포스 알고리즘, 수학

### 문제 설명

<p>I&scaron;kasta tiesi $L$ ilgio vaga, kurioje reikia pasodinti $M$ medelių. Medelius sodins robotai, todėl visi atstumai vagoje matuojami <em>robopėdomis</em>.</p>

<p>Duota pozicijų (t. y. atstumų nuo vagos pradžios) seka $P_1, P_2, \dots , P_M$. Kiekvienoje &scaron;ių pozicijų turi būti pasodintas vienas medelis.</p>

<p>Darbą turi atlikti $2$ robotai. Kiekvienas robotas per $1$ laiko vienetą nuvažiuoja $1$ robopėdą, o per $S$ laiko vienetų pasodina vieną medelį.</p>

<p>Per kiek mažiausiai laiko galima pasodinti visus medelius, jeigu dirbs abu robotai? Pirmojo roboto pradinė pozicija yra $0$, o antrojo &ndash; $L$. Abu robotai darbą pradeda tuo pačiu laiko momentu $0$.</p>

<p>Duotas medelių skaičius $M$, vagos ilgis $L$, bei laikas, per kurį robotas pasodina vieną medelį $S$. Taip pat duotas pozicijų, surikiuotų didėjimo tvarka, sąra&scaron;as $P_1, P_2, \dots , P_M$.</p>

<p>Para&scaron;ykite programą, kuri apskaičiuotų trumpiausią sodinimo laiką T, per kurį robotai gali pasodinti visus medelius.</p>

### 입력

<p>Pirmojoje eilutėje pateikti trys sveikieji skaičiai: $M$ &ndash; pozicijų skaičius, $L$ &ndash; vagos ilgis, $S$ &ndash; vieno medelio sodinimo laikas.</p>

<p>Likusiose $M$ eilučių pateiktos medelių sodinimo pozicijos $P_1, P_2, \dots , P_M$ &ndash; po vieną sveikąjį skaičių kiekvienoje eilutėje.</p>

### 출력

<p>Pirmojoje (ir vienintelėje) eilutėje i&scaron;veskite trumpiausią sodinimo laiką T.</p>

### 제한

<ul>
	<li>$1 &le; M &le; 10^6$</li>
	<li>$1 &le; L &le; 10^9$</li>
	<li>$1 &le; S &le; 10^3$</li>
	<li>$0 &le; P_i &le; L$</li>
</ul>