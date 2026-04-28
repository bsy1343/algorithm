# [Silver I] Auksinės monetos - 30079

[문제 링크](https://www.acmicpc.net/problem/30079)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 40, 정답: 17, 맞힌 사람: 16, 정답 비율: 41.026%

### 분류

다이나믹 프로그래밍, 격자 그래프

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30079.%E2%80%85Auksin%C4%97s%E2%80%85monetos/ed2646cc.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/30079.%E2%80%85Auksin%C4%97s%E2%80%85monetos/ed2646cc.png" data-original-src="https://upload.acmicpc.net/a7551fed-2631-40ae-962c-704fb8249741/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 119px; height: 111px; float: right;" />Jonas žaidžia kompiuterinį žaidimą apie legendinį aukso miestą <em>El Dorado</em>. Ką Jonas veikia auksiniame mieste? Žinoma, renka auksą!</p>

<p>Miesto žemėlapis yra $N \times M$ dydžio stačiakampis, kuriame kiekviename ta&scaron;ke yra pastatas, gatvė arba aukso moneta. Jonas gali judėti tik pietų (žemėlapyje žemyn) bei rytų (žemėlapyje de&scaron;inėn) kryptimis ir nori susirinkti kiek įmanoma daugiau monetų.</p>

<p>Laukelį kuriame stovi Jonas pažymėkime $(i, j)$:</p>

<ul>
	<li>jei laukelyje $(i, j)$ yra auksinė moneta, Jonas ją pasiima;</li>
	<li>jis gali pajudėti į laukelį $(i+ 1, j)$ arba į $(i, j + 1)$, jei &scaron;ie laukeliai yra žemėlapyje ir juose nėra pastato;</li>
	<li>jei Jonas nebegali pajudėti, žaidimas baigiamas.</li>
</ul>

<p>Jonas turi visą miesto žemėlapį. Suskaičiuokite, kiek daugiausiai monetų Jonas gali susirinkti, jeigu jis pradeda žaidimą langelyje $(1, 1)$.</p>

### 입력

<p>Pirmoje eilutėje pateikti du sveikieji skaičiai $N$ ir $M$ nurodantys miesto dydį.</p>

<p>Tolimesnėse $N$ eilučių yra po $M$ simbolių $s_{i,j}$ ($1 &le; i &le; N$, $1 &le; j &le; M$):</p>

<ul>
	<li>jei $s_{i,j} =$ <code>.</code>, &scaron;iame laukelyje yra nutiesta gatvė;</li>
	<li>jei $s_{i,j} =$ <code>x</code>, &scaron;iame laukelyje yra pastatas;</li>
	<li>jei $s_{i,j} =$ <code>o</code>, &scaron;iame laukelyje yra nutiesta gatvė, <code>o</code> ant jos guli auksinė moneta.</li>
</ul>

<p>Žemėlapio kairiajame vir&scaron;utiniame laukelyje $(1, 1)$ niekada nebus pastato.</p>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; kiek daugiausiai auksinių monetų gali surinkti Jonas.</p>

### 제한

<ul>
	<li>$1 &le; N, M &le; 500$</li>
</ul>