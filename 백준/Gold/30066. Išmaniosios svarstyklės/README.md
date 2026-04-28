# [Gold IV] Išmaniosios svarstyklės - 30066

[문제 링크](https://www.acmicpc.net/problem/30066)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

구현, 자료 구조, 이분 탐색, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Martynas nusipirko i&scaron;maniąsias svarstykles ir nori sukurti programėlę savo svoriui sekti. Tačiau svarstyklėmis naudosis ne jis vienas &ndash; kartais pasinaudos svečiai, draugai, arba ant svarstyklių gali netyčia užlipti ir jo katinas.</p>

<p>Martynas sugalvojo algoritmą, kaip sekti, kiek skirtingų klientų naudojasi svarstyklėmis. I&scaron; pradžių, svarstyklėmis nesinaudoja nei vienas klientas. Kai yra naujas matavimas, jis priskiriamas klientui pagal tokias taisykles:</p>

<ol>
	<li>Jei matavimas nuo visų esamų klientų paskutinio svorio matavimo skiriasi <em>daugiau negu</em> $D$ <em>gramų</em>, tai laikoma, kad sveriasi naujas klientas ir jis yra užregistruojamas.</li>
	<li>Prie&scaron;ingu atveju, matavimas priskiriamas tam klientui, kurio paskutinis svorio matavimas yra artimiausias &scaron;iam matavimui.</li>
	<li>Jei yra keli klientai, kuriems tinka sąlyga (2), matavimas priskiriamas tam klientui, kurio paskutinis svorio matavimas yra mažesnis.</li>
</ol>

<p>Pavyzdžiui, tarkime, jog svarstyklės užregistravo tokius matavimus i&scaron; eilės:</p>

<ol>
	<li>$75000$ gramų: Martynas pasisvėrė ryte.</li>
	<li>$75500$ gramų: Martynas pasisvėrė vakare.</li>
	<li>$3000$ gramų: Pasisvėrė katinas.</li>
	<li>$78500$ gramų: Martyno draugas i&scaron;bandė svarstykles.</li>
	<li>$2950$ gramų: Ant svarstyklių vėl užlipo katinas.</li>
	<li>$77000$ gramų: Vėl pasisvėrė Martynas (pavalgęs).</li>
</ol>

<p>Su parametru $D = 1500$, Martyno algoritmas sugebėtų teisingai atskirti, jog svartyklėmis i&scaron; viso naudojosi trys klientai:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30066.%E2%80%85I%C5%A1maniosios%E2%80%85svarstykl%C4%97s/45dcafa8.png" data-original-src="https://upload.acmicpc.net/dcb86b10-a542-4f12-9e84-f6633ad91f5d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 326px; height: 273px;" /></p>

<p>Jums duota $N$ svorio matavimų, kuriuos užregistravo i&scaron;maniosios svarstyklės, ir parametras $D$. Pagal Martyno sugalvotą algoritmą suskaičiuokite, kiek skirtingų klientų (žmonių, katinų, pelių...) i&scaron; viso pasinaudojo svarstyklėmis.</p>

### 입력

<p>Pirmoje eilutėje įra&scaron;yti su sveikieji skaičiai $N$ ir $D$. Toliau seka $N$ eilučių, kuriose įra&scaron;yta po vieną svorio matavimą $m_i$ (gramais).</p>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; kiek klientų pasinaudojo i&scaron;maniosiomis svarstyklėmis.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 10\,000$</li>
	<li>$0 &lt; D, m_i &le; 200\,000$</li>
</ul>