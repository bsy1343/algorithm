# [Silver III] Dešifravimas - 30065

[문제 링크](https://www.acmicpc.net/problem/30065)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 16, 맞힌 사람: 11, 정답 비율: 55.000%

### 분류

구현, 문자열

### 문제 설명

<p>Informatikas Bitukas turi smalsių draugų, todėl su užjūrio draugu Brituku susira&scaron;inėja &scaron;ifruodamas savo žinutes. Tam jis naudoja Cezario &scaron;ifrą, kurį nors ir nėra sunku nulaužti, tačiau smalsiems draugams už&scaron;ifruotos žinutės atrodo kaip atsitiktinė simbolių seka.</p>

<p>Cezario &scaron;ifras veikia taip: susira&scaron;inėjimo dalyviai apsikeičia raktu $K$ ($1 &le; K &le; 25$), tuomet kiekviena raidė yra pakeičiama į jos $K$-tąją kaimynę pagal lotyni&scaron;kąją abėcėlę. Likę simboliai paliekami tokie patys. Abėcėlė apsisuka: <code>Z</code> pirmoji kaimynė yra <code>A</code>, o <code>z</code> pirmoji kaimynė &mdash; <code>a</code>.</p>

<p>Pasižiūrėkime, kaip Bitukas už&scaron;ifruotų žinutę <code>Kaip_gyveni?</code> su raktu $K = 7$:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b661c7c3-58aa-42e0-b60f-1ddc8b38e119/-/preview/" style="width: 523px; height: 292px;" /></p>

<p>Norėdamas žinutes &scaron;ifruoti greičiau, Bitukas sukonstravo Bituko &Scaron;ifravimo Ma&scaron;iną (B&Scaron;M). Bitukas į B&Scaron;M įveda pradinę žinutę, tuomet paleidžia ma&scaron;iną ir &scaron;i pradeda &scaron;ifruoti žinutę po vieną simbolį nuo pradžios iki galo.</p>

<p>Vieną vakarą Bitukas &scaron;ifravo labai ilgą lai&scaron;ką Britukui, mat norėjo papasakoti apie savo studijas. Tačiau, B&Scaron;M netikėtai užstrigo ir už&scaron;ifravo tik dalį žinutės. Bitukas nepasimetė: paleido ma&scaron;iną i&scaron; naujo ir &scaron;į kartą ma&scaron;ina žinutę už&scaron;ifravo sėkmingai! Tik neapsižiūrėjęs jis i&scaron;siuntė Britukui abi žinutes...</p>

<p>Britukui tą vakarą irgi nesisekė: jis pamir&scaron;o abiejų sutartą raktą.</p>

<p>Jūsų užduotis &ndash; para&scaron;yti programą, kuri perskaičiusi abi Brituko gautas žinutes i&scaron;&scaron;ifruotų Bituko siųstą žinutę.</p>

### 입력

<p>Pirmoje eilutėje įra&scaron;ytas vienas sveikasis skaičius &mdash; žinutės ilgis $M$.</p>

<p>Antroje eilutėje įra&scaron;yta Brituko gauta žinutė, už&scaron;ifruota su užstringančia ma&scaron;ina. Trečioje eilutėje &mdash; žinutė, už&scaron;ifruota su veikiančia ma&scaron;ina.</p>

<p>Žinutėse tarpo simbolių nebus.</p>

### 출력

<p>I&scaron;veskite vieną eilutę &mdash; i&scaron;&scaron;ifruotą Bituko siunčiamą žinutę.</p>

### 제한

<ul>
	<li>$1 &le; M &le; 100\,000$</li>
</ul>