# [Platinum III] Ralli süvakosmoses - 29974

[문제 링크](https://www.acmicpc.net/problem/29974)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 2, 맞힌 사람: 2, 정답 비율: 15.385%

### 분류

그래프 이론, 자료 구조, 그리디 알고리즘, 트리, 분리 집합, 최소 스패닝 트리, 최소 공통 조상, 희소 배열

### 문제 설명

<p>Vastavalt Tsiolkovski valemile kulub raketi kiirendamiseks paigalseisust kiiruseni $v$ k&uuml;tust kogumassiga \[ m = m_0\left(e^{\frac{v}{u}} - 1\right), \] kus $m_0$ on raketi t&uuml;himass ja $u$ k&uuml;tuse heitekiirus. Valem t&ouml;&ouml;tab tingimusel, et kiirendamise k&auml;igus tehakse k&uuml;tusepaak t&uuml;hjaks.</p>

<p>Selles &uuml;lesandes eeldame, et raketi k&uuml;tusepaak on l&otilde;putu mahuga, $m_0 = 1$, $u = 1$, $e \approx 2$ ja $e^{\frac{v}{u}} \gg 1$. Sel juhul kulub raketi kiirendamiseks kiiruseni $v$ k&uuml;tust $2^{v}$ &uuml;hikut.</p>

<p>Kosmoses korraldatakse ralli, mis koosneb $V$ kontrollpunktist ja $E$ kahesuunalisest takistusrajast, mis &uuml;hendavad kontrollpunkte. Takistusraja number $k$ l&auml;bimiseks on vaja kiirendada rakett kiiruseni $k$.</p>

<p>Iga kontrollpunkti l&auml;bimiseks peab rakett t&auml;ielikult peatuma, kusjuures pidurdamine k&uuml;tust ei kuluta. Kontrollpunktides on v&otilde;imalik raketi k&uuml;tusepaaki t&auml;ita.</p>

<p>Lisaks on teada, et &uuml;htki kontrollpunktide paari ei &uuml;henda rohkem kui &uuml;ks takistusrada, &uuml;kski takistusrada ei &uuml;henda m&otilde;nda kontrollpunkti iseendaga ja igast kontrollpunktist p&auml;&auml;seb m&ouml;&ouml;da takistusradu igasse teise kontrollpunkti.</p>

<p>Ralli koosneb $Q$ etapist, igas etapis on vaja liikuda mingist kontrollpunktist $p$ mingisse kontrollpunkti $q$. Leida iga etapi l&auml;bimiseks vajalik k&uuml;tusekulu. Kuna k&uuml;tusekulud v&otilde;ivad olla v&auml;ga suured, v&auml;ljastada nad mooduli $10^9 + 7$ j&auml;rgi.</p>

### 입력

<p>Tekstifaili esimesel real on kolm t&uuml;hikutega eraldatud t&auml;isarvu: kontrollpunktide arv $V$ ($1 \le V \le 10^5$), takistusradade arv $E$ ($1 \le E \le 3 \cdot 10^5$) ning etappide arv $Q$ ($1 \le Q \le 10^5$).</p>

<p>J&auml;rgmisel $E$ real on iga&uuml;hel kaks t&uuml;hikuga eraldatud t&auml;isarvu $a$ ja $b$ ($1 \le a \le V$, $1 \le b \le V$), mis n&auml;itavad, et kontrollpunktid $a$ ja $b$ on &uuml;hendatud kahesuunalise takistusrajaga. Faili real number $k + 1$ kirjeldatakse takistusrada number $k$.</p>

<p>J&auml;rgmisel $Q$ real on iga&uuml;hel kaks t&uuml;hikuga eraldatud t&auml;isarvu $p$ ja $q$ ($1 \le p \le V$, $1 \le q \le V$), mis n&auml;itavad, mis kontrollpunktides etapp vastavalt algab ja l&otilde;ppeb.</p>

### 출력

<p>Tekstifaili v&auml;ljastada $Q$ rida, igale reale &uuml;he etapi l&auml;bimise minimaalne k&uuml;tusekulu. Etappide k&uuml;tusekulud v&auml;ljastada samas j&auml;rjekorras, milles etapid sisendis anti.</p>