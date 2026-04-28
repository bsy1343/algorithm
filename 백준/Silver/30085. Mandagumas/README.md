# [Silver II] Mandagumas - 30085

[문제 링크](https://www.acmicpc.net/problem/30085)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 30, 맞힌 사람: 21, 정답 비율: 87.500%

### 분류

구현, 자료 구조, 시뮬레이션, 덱

### 문제 설명

<p>Ilgu koridoriumi eina $N$ labai mandagių žmonių. Koridoriuje yra įrengtos dviejų tipų durys:</p>

<ol>
	<li>&bdquo;A&ldquo; tipo durys: atidaromos traukiant. Priėjus tokias duris, pirmasis žmogus mandagiai praleidžia visus kitus i&scaron; eilės, ir tampa paskutinis. Visų kitų žmonių tvarka eilėje tarpusavyje nepasikeičia.</li>
	<li>&bdquo;B&ldquo; tipo durys: atidaromos stumiant. Priėjus tokias duris, pirmasis žmogus mandagiai praleidžia antrąjį, antrasis &ndash; trečiąjį ir taip toliau. Taigi perėjus &bdquo;B&ldquo; tipo duris, visa eilė &bdquo;apsivečia&ldquo;: paskutinis ėjęs dabar tampa pirmasis, o pirmas &ndash; paskutinis.</li>
</ol>

<p>Mandagieji žmonės i&scaron; pradžių yra sunumeruoti nuo $1$ iki $N$. Jums duota seka durų, kurias jie turi praeiti. Raskite, kokia tvarka bus i&scaron;sidėstę žmonės perėję pro visas duris.</p>

### 입력

<p>Pirmojoje eilutėje įra&scaron;ytas mandagių žmonių skaičius $N$. Antrojoje eilutėje įra&scaron;ytas durų skaičius koridoriuje $M$. Kitose $M$ eilučių įra&scaron;yta po vieną simbolį, <code>A</code> arba <code>B</code>, kurie žymi durų tipus koridoriuje, ta tvarka, kuria juos praeis žmonės.</p>

### 출력

<p>Jūs turite i&scaron;vesti $N$ skaičių po vieną eilutėje &ndash; mandagių žmonių numerius, ta tvarka, kuria jie bus i&scaron;sidėstę perėje pro visas duris.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 100\,000$</li>
	<li>$0 &le; M &le; 100\,000$</li>
</ul>