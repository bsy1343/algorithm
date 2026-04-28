# [Gold V] Poliitikud - 7205

[문제 링크](https://www.acmicpc.net/problem/7205)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 10, 맞힌 사람: 7, 정답 비율: 31.818%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>E-valimiste vastase propaganda k&auml;igus pakuti v&auml;lja m&otilde;te asendada valimised poliitiliste ametikohtade m&auml;&auml;ramisega poliitikute t&auml;htsuse j&auml;rgi.</p>

<p>Antud on hulk poliitikute vahelisi seoseid. Iga seos v&auml;ljendab, mitu korda t&auml;htsam &uuml;ks poliitik teisest on. T&auml;htsusseosed suhtuvad omavahel j&auml;rgmiselt: kui poliitik A on x korda t&auml;htsam kui poliitik B ja poliitik B on y korda t&auml;htsam kui poliitik C, siis poliitik A on x&middot;y korda t&auml;htsam kui poliitik C. Lisaks, kui poliitik A on x korda t&auml;htsam kui poliitik B, siis poliitik B on 1 x korda t&auml;htsam kui poliitik A. V&otilde;ib eeldada, et sisendandmed ei sisalda vastuolusid ja v&otilde;imaldavad k&otilde;iki poliitikuid omavahel v&otilde;rrelda.</p>

<p>Leida, kes on k&otilde;ige t&auml;htsam, kes on k&otilde;ige v&auml;hem t&auml;htis ja kui palju kordi on k&otilde;ige t&auml;htsam poliitik k&otilde;ige v&auml;hem t&auml;htsast poliitikust t&auml;htsam.</p>

### 입력

<p>Tekstifaili esimesel real on t&auml;isarv N (1 &le; N &le; 100 000): antud t&auml;htsusseoste arv. Faili j&auml;rgmisel N real on iga&uuml;hel t&uuml;hikutega eraldatult kahe poliitiku nimed ja t&auml;isarv X (1 &le; X &lt; 2<sup>32</sup>), mis n&auml;itab, mitu korda esimene poliitik teisest t&auml;htsam on. Poliitikute nimed on maksimaalselt 10 t&auml;hem&auml;rgi pikkused ja v&otilde;ivad sisaldada v&auml;iket&auml;hti ja numbreid (kuid mitte suurt&auml;hti, t&uuml;hikuid ega muid m&auml;rke).</p>

### 출력

<p>Tekstifaili polgval.txt ainsale reale v&auml;ljastada t&uuml;hikutega eraldatult k&otilde;ige t&auml;htsama poliitiku nimi, k&otilde;ige v&auml;hem t&auml;htsa poliitiku nimi ja reaalarv Y, mis n&auml;itab, mitu korda on k&otilde;ige t&auml;htsam poliitik t&auml;htsam k&otilde;ige v&auml;hem t&auml;htsast poliitikust. V&otilde;ib eeldada, et Y &lt; 2<sup>32</sup>. V&auml;ljastatud vastus ei tohi t&auml;psest erineda rohkem kui 0,01 v&otilde;rra. Kui maksimaalse t&auml;htsusega poliitikuid on mitu, v&auml;ljastada neist &uuml;ksk&otilde;ik millise nimi; samamoodi ka mitme minimaalse t&auml;htusega poliitiku korral.</p>