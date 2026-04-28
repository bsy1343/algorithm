# [Gold III] YouTube - 30059

[문제 링크](https://www.acmicpc.net/problem/30059)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 19, 맞힌 사람: 14, 정답 비율: 25.455%

### 분류

브루트포스 알고리즘, 그리디 알고리즘, 누적 합, 정렬

### 문제 설명

<p>Rimantas mokosi žaisti &scaron;achmatais žiūrėdamas &bdquo;YouTube&ldquo; filmukus. Kiekvienas filmukas turi tam tikrą mokamąją vertę, kuri priklauso nuo filmuko rū&scaron;ies $r_i$. Paprastai Rimantas žiūri dviejų rū&scaron;ių filmukus:</p>

<ol>
	<li>Kitų žaidėjų &scaron;achmatų partijų įra&scaron;us. &Scaron;ių filmukų vertė yra $v_i = 1$.</li>
	<li>Pamokas, kuriose paai&scaron;kinamos įvairios taktikos ir strategijos. &Scaron;ių filmukų vertė yra dvigubai didesnė, t. y. $v_i = 2$.</li>
</ol>

<p>Žinomi visi filmukai, kuriuos Rimantas gali peržiūrėti: jų trukmė ir rū&scaron;is (apra&scaron;yta auk&scaron;čiau). Raskite, kiek mažiausiai laiko Rimtantas turės žiūrėti &bdquo;YouTube&ldquo;, kad surinktų bent $V$ vertės ta&scaron;kų, jeigu:</p>

<ul>
	<li>Rimantas nežiūri to paties filmuko kelis kartus (papildomos vertės tai neprideda).</li>
	<li>Pradėjęs filmuką, Rimantas visuomet jį peržiūri iki galo.</li>
</ul>

### 입력

<p>Pirmojoje eilutėje įra&scaron;ytas galimų filmukų skaičius $N$ bei Rimanto norima pasiekti vertė $V$. Kitose eilutėse pateikta po du sveikuosius skaičius apibūdinančius kiekvieną filmuką: filmuko rū&scaron;is $r_i$ bei trukmė $t_i$.</p>

### 출력

<p>I&scaron;veskite, kiek mažiausiai laiko Rimantas turės žiūrėti &bdquo;YouTube&ldquo;, kad surinktų bent $V$ vertės ta&scaron;kų.</p>

<p>Jei surinkti tiek vertės ta&scaron;kų neįmanoma, i&scaron;veskite $-1$.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 1\,000\,000$</li>
	<li>$1 &le; V, t_i &le; 1\,000\,000$</li>
	<li>$r_i &isin; \{1, 2\}$</li>
</ul>