# [Gold V] Marginimas - 30200

[문제 링크](https://www.acmicpc.net/problem/30200)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 11, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

수학

### 문제 설명

<p>Iki Velykų liko N valandų ir Ki&scaron;kis nespėja atlikti savo darbų. Ki&scaron;kis turi R kiau&scaron;inių marginimui robotų ir jiems patikės &scaron;į darbą.</p>

<p>Kiekvienas robotas moka pie&scaron;ti vieną ornamentą, o visų robotų pie&scaron;iami ornamentai skirtingi. Kiau&scaron;inis laikomas i&scaron;margintu, jei visi robotai ant jo nupie&scaron;ė savo ornamentą.</p>

<p>Robotai dirba su pertraukomis: robotas i kiau&scaron;inius margina kas a<sub>i</sub> valandų (pirmasis kiau&scaron;inis margintas valandą a<sub>i</sub>, antrasis &ndash; valandą 2a<sub>i</sub> ir t.t.).</p>

<p>Kiekvieną valandą Ki&scaron;kis ant konvejerio padeda vieną kiau&scaron;inį. Kiekvienas tą valandą dirbantis robotas nupie&scaron;ia savo ornamentą.</p>

<p>Taip robotai ir Ki&scaron;kis be pertraukos dirbą N valandų (valandos numeruojamos nuo 1 iki N). Ki&scaron;kis pastebėjo, kad dauguma kiau&scaron;inių nėra pilnai i&scaron;marginti!</p>

<p>Ki&scaron;kis susirūpino, o kiek kiau&scaron;inių robotai pilnai i&scaron;margins iki Velykų.</p>

<p>Para&scaron;ykite programą, kuri suskaičiuotų kiek bus pilnai i&scaron;margintų kiau&scaron;inių po N valandų.</p>

### 입력

<p>Pirmojoje eilutėje pateikti du sveikieji skaičių N ir R.</p>

<p>Antrojoje eilutėje pateikta R tarpu atskirtų skaičių a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>R</sub>.</p>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; pinai numargintų kiau&scaron;inių skaičių.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000 000</li>
	<li>1 &le; R &le; 400 000</li>
	<li>1 &le; a<sub>i</sub> &le; 100 (kur 1 &le; i &le; R)</li>
	<li>duomenys tokie, kad robotai būtinai baigs marginti bent vieną kiau&scaron;inį.</li>
</ul>