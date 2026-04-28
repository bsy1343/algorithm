# [Silver V] Kingikott - 29896

[문제 링크](https://www.acmicpc.net/problem/29896)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 34, 맞힌 사람: 27, 정답 비율: 50.000%

### 분류

자료 구조, 그리디 알고리즘, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>J&otilde;uluvana on koostanud nimekirja kinkidest, mida sellel aastal lastele viia. Iga kingi kohta on teada selle hind poes. Poem&uuml;&uuml;ja, oletades, et j&otilde;uluvana pole k&otilde;ige nupukam, pakub j&auml;rgmist allahindlust: j&otilde;uluvana v&otilde;ib kahe poes m&uuml;&uuml;gil oleva kaubaartikli hinnad omavahel &auml;ra vahetada. Aita j&otilde;uluvanal v&auml;lja m&otilde;elda, millised hinnad tuleks omavahel vahetada, et kingitustele kuluv summa oleks v&auml;him v&otilde;imalik.</p>

### 입력

<p>Sisendi esimesel real on poes olevate kaubaartiklite arv $N$ ($1 \le N \le 1\,000$).</p>

<p>J&auml;rgmisel $2 \cdot N$ real on $N$ kaherealist plokki. Iga ploki esimesel real on &uuml;he kaubaartikli nimetus (1 kuni 20 v&auml;ikest ladina t&auml;hte) ja teisel real selle t&auml;isarvuline hind $P$ ($1 \le P \le 1\,000$). V&otilde;ib eeldada, et kaupade nimetused poes on unikaalsed.</p>

<p>J&auml;rgmisel real on j&otilde;uluvana nimekirjas olevate kinkide arv $M$ ($1 \le M \le 1\,000$).</p>

<p>J&auml;rgmisel $M$ real on iga&uuml;hel &uuml;he nimekirjas oleva kingi nimetus. V&otilde;ib eeldada, et neid k&otilde;iki on poes piisavas koguses olemas.</p>

### 출력

<p>V&auml;ljastada &uuml;ks arv: v&auml;him v&otilde;imalik summa, mille eest saab k&otilde;ik nimekirjas olevad kingid osta, kui enne arve kokkul&ouml;&ouml;mist v&otilde;ib (aga ei pea) omavahel vahetada kahe artikli hinnad.</p>