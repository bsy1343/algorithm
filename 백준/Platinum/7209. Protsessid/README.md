# [Platinum V] Protsessid - 7209

[문제 링크](https://www.acmicpc.net/problem/7209)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

이분 탐색

### 문제 설명

<p>Kolja hakkas tõsisemalt teoreetilise füüsikaga tegelema ja oma lõputööks on tal vaja superarvutil hulk arvutusi ära teha. Iga arvutust nimetatakse <em>ülesandeks</em>, need on jagatud mingiks hulgaks <em>järjekordadeks</em> ja iga järjekord antakse arvutamiseks eraldi <em>protsessile</em>.</p>

<p>Protsessid töötavad paralleelselt. Igal sekundil võib iga protsess teha ühe kahest tegevusest:</p>

<ul>
	<li>Teha käsil olevast järjekorrast üks &uml; ulesanne ära.</li>
	<li>Luua uus protsess ja anda osa oma järjekorrast sellele. Näiteks, kui järjekorras on 10 ülesannet, võib uue protsessi loomisel anda 3 ülesannet sellele ja 7 endale jätta.</li>
</ul>

<p>Operatsioonisüsteemi ise ärasuste tõttu on uute protsesside loomiste koguarv piiratud (seejuures töö lõpetanud protsessi enam taaskäivitada või mingil muul moel uuesti kasutada ei saa).</p>

<p>Leida minimaalne sekundite arv, millega on võimalik kõik ülesanded ära teha.</p>

### 입력

<p>Tekstifaili esimesel real on maksimaalne lubatud uute protsesside loomiste arv K. Teisel real on esialgne protsesside arv N. Järgmisel N real on igaühel täisarv A<sub>i</sub>, ülesannete arv vastava algse protsessi järjekorras (1 &le; A<sub>i</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>Tekstifaili väljastada minimaalne kõigi ülesannete täitmiseks vajalik sekundite arv.</p>