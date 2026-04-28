# [Silver III] Šokoladas - 7254

[문제 링크](https://www.acmicpc.net/problem/7254)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 35, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Vytautas darbo metu mėgsta valgyti &scaron;okoladą bei vai&scaron;inti juo savo kolegas. Jis perka &scaron;okolado plyteles, padalintas į M &times; N kvadratėlių, ant kurių užra&scaron;yti skaičiai nuo 1 iki G .</p>

<p>Visi kvadratėliai, ant kurių vir&scaron;aus yra tas pats skaičius, sudaro sritį, kurios gali būti įvairių formų ir nebūtinai vientisos.</p>

<p>Vytautas planuoja pavai&scaron;inti kolegas ir nori nusipirkti tokią &scaron;okolado plytelę, kuriose visos minėtos sritys yra vientisi stačiakampiai.</p>

<p>Pavyzdys 1. Tarkime, yra tokia 2 &times; 6 plytelė:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7254.%E2%80%85%C5%A0okoladas/825c7537.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/7254.%E2%80%85%C5%A0okoladas/825c7537.png" data-original-src="https://upload.acmicpc.net/096bc1b0-d7f5-4b96-ae51-24fe075560c8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 115px;" /></p>

<p>Kvadratėliai su skaičiumi 1 sudaro stačiakampę sritį 2 &times; 3, su skaičiais 2 ir 3 &ndash; sritis 1 &times; 2. Pagaliau, kvadratėliai su skaičiais 4 ir 5 sudaro stačiakampes sritis 1 &times; 1. Taigi, &scaron;i plytelė Vytautui yra tinkama.</p>

<p>Pavyzdys 2. Dabar panagrinėkime kitą, 3 &times; 6 dydžio, plytelę:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7254.%E2%80%85%C5%A0okoladas/17406538.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/7254.%E2%80%85%C5%A0okoladas/17406538.png" data-original-src="https://upload.acmicpc.net/ad7d5887-f5fd-44db-87e2-99170b4f0348/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 309px; height: 173px;" /></p>

<p>&Scaron;i plytelė nėra tinkama dėl dviejų priežasčių. Kvadratėliai su skaičiumi 1 sudaro dvi atskiras stačiakampio sritis ir nėra vientisas stačiakampis. Kvadratėliai su skaičiumi 2 sudaro vientisą sritį, bet tai nėra stačiakampis.</p>

<p>Duota &scaron;okolado plytelė. Nustatykite, ar ją galima padalinti į vientisas stačiakampes sritis.</p>

### 입력

<p>Pirmoje eilutėje pateikti trys sveikieji skaičiai M, N, G, kurių pirmieji du apibrėžia plytelės dydį, o trečias rei&scaron;kia didžiausią skaičių, užra&scaron;ytą ant kurio nors kvadratėlio.</p>

<p>Tolimesnėse M eilutėse pateikiami skaičiai ant kavadratėlių &ndash; po N kiekvienoje eilutėje.</p>

### 출력

<p>I&scaron;veskite žodį TAIP, jeigu plytelę galima padalinti į vientisas stačiakampes sritis, arba NE &ndash; jeigu to negalima padaryti.</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 1 000</li>
	<li>1 &le; G &le; M &times; N</li>
</ul>