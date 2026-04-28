# [Silver I] Keleiviai - 7270

[문제 링크](https://www.acmicpc.net/problem/7270)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 9, 맞힌 사람: 9, 정답 비율: 50.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>Kiekvieną savaitgalį i&scaron; Bitlandijos į Vilnių skrenda lėktuvas. &Scaron;io lėktuvo keleiviai yra labai įnoringi ir sudaro daug problemų įgulai: nuolatos pra&scaron;o tai arbatos, tai pagalvėlės ir pan.</p>

<p>Įgulai bandant i&scaron;pildyti visus norus, lėktuvą kartais tenka užlaikyti ore vir&scaron; Vilniaus! Žinoma, tai nepatinka Bitlandijos oro linijoms, tad jos nusprendė nuo &scaron;iol pra&scaron;yti savo keleivių i&scaron; anksto pateikti sąra&scaron;ą ko ir kada jie pra&scaron;ys.</p>

<p>Turėdami &scaron;į sąra&scaron;ą Jūs turėsite rasti, kiek laiko skrydžių palydovė užtruks pildydama visus norus, jei savo laiką ji planuos optimaliai.</p>

<p>Jums taip pat žinoma, kad:</p>

<ul>
	<li>Perėjimas tarp lėktuvo eilių užtrunka 1 min;</li>
	<li>Palydovė geba pildyti norus labai greitai &ndash; noro pildymas daug laiko neužtrunka;</li>
	<li>Palydovė pradeda skrydį stovėdama ties pirmąja eile;</li>
	<li>Palydovė turi pabaigti skrydį stovėdama ties pirmąja eile.</li>
</ul>

### 입력

<p>Pirmojoje eilutėje pateiktas norų skaičius N.</p>

<p>Tolimesnėse N eilučių pateikta po vieną skaičių a<sub>i</sub>, b<sub>i</sub> porą, apra&scaron;ančią vieną keleivio norą. Čia a<sub>i</sub> &ndash; eilės, kurioje sėdi keleivis, numeris, o b<sub>i</sub> &ndash; anksčiausias laiko momentas, kai i-tasis noras bus pateiktas (jį i&scaron;pildyti galima ir vėliau).</p>

### 출력

<p>Jums reikia i&scaron;vesti vieną skaičių &ndash; per kiek mažiausiai minučių palydovei pavyks įvykdyti visus norus ir sugrįžti iki pirmosios eilės.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100 000</li>
	<li>1 &le; a<sub>i</sub>, b<sub>i</sub> &le; 1 000 000</li>
</ul>