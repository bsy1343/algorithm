# [Gold IV] Karosai - 30062

[문제 링크](https://www.acmicpc.net/problem/30062)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

자료 구조, 그래프 이론, 정렬, 최단 경로, 데이크스트라, 분리 집합

### 문제 설명

<p>Karosas Rosas plaukioja tvenkinių sistemoje, sudarytoje i&scaron; $N$ tvenkinių. Kai kurie i&scaron; tvenkinių yra sujungti, taigi galima perplaukti i&scaron; vieno į kitą. Tačiau juos skiria tam tikro auk&scaron;čio pertvara, kurią žymėsime $h_{i,j}$ (be abejo, $h_{i,j} = h_{j,i}$). Karosai gali perplaukti i&scaron; tvenkinio $i$ į tvenkinį $j$ tik tuomet, kai vandens lygis tvenkinyje $i$ yra <em>nemažesnis nei</em> $h_{i,j}$.</p>

<p>Pavyzdžiui, yra trys tvenkiniai ($N = 3$), pirmas ir antras tvenkiniai yra sujungti pertvara, kurios auk&scaron;tis $h_{1,2} = 5\,000$, o antras ir trečias &ndash; pertvara, kurios auk&scaron;tis $h_{2,3} = 7\,000$. Karosai galės perplaukti i&scaron; pirmo tvenkinio į antrą, jeigu vandens lygis pirmame (taigi ir antrame) tvenkinyje sieks bent $5\,000$. Tačiau, jie galėtų perplaukti i&scaron; pirmo į trečią tvenkinį, tik jei vandens lygis sieks $7\,000$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30062.%E2%80%85Karosai/ca64f9d9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/30062.%E2%80%85Karosai/ca64f9d9.png" data-original-src="https://upload.acmicpc.net/b0a1c192-4cd6-4391-a5b0-12e5814ed2c8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 366px; height: 169px;" /></p>

<p style="text-align: center;">Karosai gali perplaukti i&scaron; pirmojo į antrąjį tvenkinį, bet ne į trečiąjį.</p>

<p>Karosas Rosas yra apsistojęs $1$-ame tvenkinyje, o jo draugas &ndash; tvenkinyje nr. $N$. Rosui rūpi, koks turi būti vandens lygis $1$-ame tvenkinyje, kad jis galėtų aplankyti savo draugą.</p>

<p>Duota tvenkinių konfigūracija. Raskite, kiek mažiausiai turi būti pakeltas vandens lygis $1$-ame tvenkinyje, kad i&scaron; jo būtų įmanoma pasiekti $N$-tąjį tvenkinį.</p>

### 입력

<p>Pirmoje eilutėje įra&scaron;yti du sveikieji skaičiai: tvenkinių skaičius $N$ bei sujungtų tvenkinių porų skaičius $M$.</p>

<p>Toliau pateikta $M$ eilučių, kuriose apra&scaron;ytos sujungtų tvenkinių poros. Kiekvienoje i&scaron; eilučių pateikta po tris sveikuosius skaičius: $i$, $j$, $h_{i,j}$, kurie žymi, kad tvenkiniai $i$ ir $j$ yra sujungti pertvara, kurios auk&scaron;tis $h_{i,j}$. ($1 &le; i &lt; j &le; N$, taip pat laikykite jog $h_{i,j} = h_{j,i}$).</p>

### 출력

<p>I&scaron;veskite vienintelį sveikąjį skaičių &ndash; minimalų vandens lygį pirmajame tvenkinyje, kuris būtinas, kad i&scaron; jo būtų galima pasiekti $N$-tąjį tvenkinį.</p>

<p>Duomenys tokie, kad visuomet yra galimas kelias i&scaron; tvenkinio $1$ į tvenkinį $N$.</p>

### 제한

<ul>
	<li>$1 &lt; N &le; 1\,000$</li>
	<li>$0 &lt; M &le; \frac{N(N-1)}{2}$</li>
	<li>$0 &lt; h_{i,j} &le; 10^9$</li>
</ul>