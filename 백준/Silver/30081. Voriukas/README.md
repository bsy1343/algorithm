# [Silver III] Voriukas - 30081

[문제 링크](https://www.acmicpc.net/problem/30081)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 21, 맞힌 사람: 18, 정답 비율: 56.250%

### 분류

수학, 자료 구조, 집합과 맵

### 문제 설명

<p>$K$-kojis voriukas visada dėvi $K$ vienodos rū&scaron;ies kojinių. Kojines voriukas skalbia skalbimo ma&scaron;inoje ir vienu skalbimu jis skalbia tik vienos rū&scaron;ies kojines. Deja, po kiekvieno skalbimo, jis pameta dalį skalbtų kojinių.</p>

<p>Padėkite voriukui suskaičiuoti, kiek &scaron;varių kojinių komplektų (vieną komplektą sudaro $K$ tos pačios rū&scaron;ies kojinių) jis turės po kiekvieno skalbimo.</p>

### 입력

<p>Pirmojoje eilutėje pateikti du sveikieji skaičiai: turimų kojinių skaičius $N$ ir voriuko kojų skaičius $K$.</p>

<p>Antrojoje eilutėje pateikti $N$ tarpu atskirtų sveikųjų skaičių $t_i$, nusakančių kiekvienos kojinės rū&scaron;į. Skaičius $t_i$ rei&scaron;kia, kad atitinkama kojinė yra $t_i$ rū&scaron;ies.</p>

<p>Trečiojoje eilutėje pateikiamas sveikasis skaičius $Q$ &ndash; plovimų skaičius.</p>

<p>Likusiose $Q$ eilučių pateikiama po du tarpu atskirtus sveikuosius skaičius $a_j$ ir $b_j$. &Scaron;ie skaičiai nurodo, kad $j$-ojo skalbimo metu, voriukas skalbė $a_j$ rū&scaron;ies kojines ir pametė $b_j$ kojinių.</p>

### 출력

<p>I&scaron;veskite $Q$ eilučių. Kiekvienoje jų turi būti sveikasis skaičius $c_k$ &ndash; kiek kojinių komplektų i&scaron; $K$ vienodos rū&scaron;ies kojinių turi voriukas po $k$-ojo skalbimo ($1 &le; k &le; Q$).</p>

### 제한

<ul>
	<li>$1 &le; N, K, Q &le; 1\,000\,000$</li>
	<li>$1 &le; t_i &le; 10\,000\,000$ ($1 &le; i &le; N$)</li>
	<li>$1 &le; a_j &le; 10\,000\,000$ ($1 &le; j &le; Q$)</li>
	<li>$1 &le; b_j &le; 1\,000\,000$ ($1 &le; j &le; Q$)</li>
	<li>Pateikiamos užklausos garantuoja, kad jokios rū&scaron;ies kojinių skaičius niekada nebus neigiamas.</li>
</ul>