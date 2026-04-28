# [Silver III] Grąža - 30069

[문제 링크](https://www.acmicpc.net/problem/30069)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 18, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>Bitlandijos prekybos tinklas &bdquo;Baxima&ldquo; nori modernizuoti savo parduotuves ir įrengti i&scaron;manius kasos aparatus. Vienas i&scaron; i&scaron;maniosios kasos komponentų yra robotas, gebantis automati&scaron;kai grąžinti grąžą bitais (Bitlandijos valiuta).</p>

<p>Bitų banknotai turi &scaron;iuos nominalus: $1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024$.</p>

<p>Dienos pradžioje kasa yra tu&scaron;čia. Toliau yra registruojamos visos transakcijos: į kasą įdedamų banknotų nominalai. Trūksta tik programinės įrangos, kuri suskaičiuotų, kaip geriausia parinkti grąžą kiekvienam klientui.</p>

<p>Para&scaron;ykite progamą, kuri rastų, kokiais nominalais robotas turi duoti grąžą, kad kiekvienam klientui būtų atiduodama kuo mažiau banknotų.</p>

### 입력

<p>Pirmoje eilutėje įra&scaron;ytas transakcijų skaičius $T$. Sekančiose $T$ eilučių įra&scaron;yta po vieną skaičių $t_i$:</p>

<ul>
	<li>Jei $t_i &gt; 0$, tai jis bus lygus vienam i&scaron; galimų Bito valiutos nominalų, ir rei&scaron;kia, kad į kasą įdedamas &scaron;io nominalo banknotas.</li>
	<li>Jei $t_i &lt; 0$, tai rei&scaron;kia, jog klientui reikalinga grąža, ir i&scaron; kasos reikia i&scaron;imti atitinkamus banknotus.</li>
</ul>

### 출력

<p>Kiekvienai grąžos transakcijai ($t_i &lt; 0$), jūs turite i&scaron;vesti po eilutę, kurioje būtų įra&scaron;yti grąžai panaudoti banknotai, nuo didžiausio iki mažiausio. Nepamir&scaron;kite, jog robotas turi grąžinti pinigus taip, kad banknotų skaičius būtų kuo mažesnis.</p>

<p>Laikykite, kad kasoje visuomet bus pakankamai banknotų, kad pavyktų duoti grąžą klientui.</p>

### 제한

<ul>
	<li>$1 &le; T &le; 1\,000$</li>
	<li>$-10^6 &le; t_i &lt; 0$ arba $t_i &isin; \{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024\}$.</li>
</ul>