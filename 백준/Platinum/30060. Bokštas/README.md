# [Platinum III] Bokštas - 30060

[문제 링크](https://www.acmicpc.net/problem/30060)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 1, 맞힌 사람: 1, 정답 비율: 16.667%

### 분류

구현, 자료 구조, 시뮬레이션, 연결 리스트

### 문제 설명

<p>Jonas mėgsta žaisti su spalvotais kubeliais. &Scaron;tai ir dabar dėliodamas $N$ kubelių vieną ant kito jis pastatė bok&scaron;tą. Deja, Jonui bok&scaron;tas nepatinka &ndash; jis norėtų taip perstatyti bok&scaron;tą, kad jame neliktų ilgų vienspalvių kubelių sekų.</p>

<p>Norėdamas tą pasiekti, Jonas i&scaron; bok&scaron;to pa&scaron;alins <strong>visas</strong> maksimalias vienspalves besiliečiančių kubelių sekas i&scaron; $&ge; K$ kubelių.</p>

<p>Pavyzdžiui, turint bok&scaron;tą:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/25aca470-94d1-4dd7-a42a-01eedc37e9a9/-/preview/" style="width: 50px; height: 171px;" /></p>

<p>ir $K = 3$, Jonas pa&scaron;alintų ilgą žalių kubelių seką. Taip gautų naują bok&scaron;tą:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ccd109ae-92f2-4a50-9dd3-f100c243bb35/-/preview/" style="width: 158px; height: 171px;" /></p>

<p>Jei bok&scaron;te yra kelios &scaron;alinamos sekos, jos <strong>visos pa&scaron;alinamos vienu metu</strong>.</p>

<p>Perstačius bok&scaron;tą jame vėl gali susidaryti ilgų tos pačios spalvos kubelių sekų. Tokiu atveju Jonas ir vėl randa visas ilgas vienspalvių kubelių sekas ir perstato bok&scaron;tą be jų.</p>

<p>&Scaron;iame bok&scaron;te raudonų kubelių seka yra ilgio $K = 3$, todėl Jonas vėl perstato bok&scaron;tą:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a678ae62-610a-431e-b2e5-55478e8c351b/-/preview/" style="width: 168px; height: 93px;" /></p>

<p>Akivaizdu, kad kartais toks perstatymo procesas gali būti kartojamas gan ilgai. Padėkite Jonui surasti, kaip atrodytų bok&scaron;tas po visų perstatymų.</p>

### 입력

<p>Pirmojoje eilutėje pateikti du sveikieji skaičiai $N$ &ndash; bok&scaron;to auk&scaron;tis, ir $K$.</p>

<p>Likusiose $N$ eilučių apra&scaron;yti bok&scaron;tą sudarančių kubelių spalvų kodai (sveikieji skaičiai):</p>

<ul>
	<li>pirmojoje eilutėje pateiktas skaičius $c_1$ &ndash; vir&scaron;utinio kubelio spalva;</li>
	<li>antrojoje eilutėje pateiktas skaičius $c_2 $&ndash; kubelio esančio po $1$-uoju spalva;</li>
	<li>$\dots$</li>
	<li>$i$-tojoje eilutėje pateiktas skaičius $c_i$ &ndash; kubelio esančio po $(i - 1)$-uoju spalva;</li>
	<li>$\dots$</li>
	<li>$N$-tojoje eilutėje pateiktas skaičius $c_N$ &ndash; apatinio kubelio spalva.</li>
</ul>

### 출력

<p>Pirmojoje eilutėje i&scaron;veskite bok&scaron;to, gauto po visų perstatymų, auk&scaron;tį $N&#39;$. Likusiose $N&#39;$ eilučių i&scaron;veskite skaičius $c&#39;_1 , c&#39;_2 , \dots , c&#39;_{N&#39;}$. Tai bok&scaron;tą sudarančių kubelių spalvų kodai pradedant bok&scaron;to vir&scaron;uje esančiu kubeliu ir baigiant apatiniu.</p>

### 제한

<ul>
	<li>$1 &le; N, K, c_i &le; 1\,000\,000$</li>
</ul>