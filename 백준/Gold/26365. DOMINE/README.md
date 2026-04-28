# [Gold III] DOMINE - 26365

[문제 링크](https://www.acmicpc.net/problem/26365)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 8, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/bb615a48-2318-4a26-acf4-55a8b7bfa144/-/preview/" style="width: 189px; height: 202px; float: right;" />Patrik i Kre&scaron;imir nedavno su prona&scaron;li drevnu domino-puzzle ploču. Ploča je pravokutnog oblika podijeljena na NxM jednakih polja, pri čemu su N i M neparni prirodni brojevi. Ploča je ispunjena s (N*M-1)/2 domino pločica, svaka pločica zauzima dva susjedna polja, neke su pločice postavljene horizontalno, neke vodoravno, a očito je da je jedno polje uvijek prazno.</p>

<p>Kre&scaron;imir i Patrik gledaju puzzle ploču i razmi&scaron;ljaju kakvi bi se sve lijepi zadaci mogli smisliti iz ove priče. Odmah im je na pamet pala jedna ideja.</p>

<p>Ako znamo kako su složene domino pločice na ploču, koliko pločica se može pomaknuti sa svoje originalne pozicije na koju su postavljene bilo kojim nizom pomicanja ostalih pločica? Npr., za ovako posloženu ploču kao na slici koja ima rupu na poziciji (1,5) prvo možemo pomaknuti pločica postavljenu na polja ((2,5), (3,5)) prema gore pa se na taj način i prazno polje premje&scaron;ta na polje (3,5). Nakon &scaron;to nju pomaknemo, otvara nam se vi&scaron;e mogućnosti, pa recimo možemo pomaknuti pločicu na pozicijama ((4,5), (5,5)) prema gore ili onu na ((3,3), (3,4)) prema desno. Od ukupno 12 domina na ploči, osam ih se u nekom trenutku može pomaknuti sa svoje originalne pozicije.</p>

<p>Napi&scaron;i program koji ispisuje koliko se različitih domino pločica u nekom trenutku može pomaknuti.</p>

### 입력

<p>U prvom retku nalaze se neparni prirodni brojevi N, M (1 &le; N, M &le; 499), gdje N označava broj redaka, a M broj stupaca ploče.</p>

<p>U sljedećih (N*M-1)/2 redaka nalaze se po četiri prirodna broja koja redom opisuju domina na puzzle ploči. Domina je opisana sa četiri broja x1, y1, x2, y2, pri tome su (x1, y1) i (x2, y2) susjedna polja koja domina prekriva, x1 i x2 označavaju retke, a y1 i y2 stupce pripadajućih polja (vidi skicu trećeg primjera).</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;i broj domina iz teksta zadatka.</p>

### 힌트

<p>Opis trećeg primjera: Žute (osjenčane) domine su one koje se mogu pomaknuti sa svoje originalne pozicije.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b1a76047-ef4b-471c-9256-9501a4a43b48/-/preview/" style="width: 242px; height: 257px;" /></p>