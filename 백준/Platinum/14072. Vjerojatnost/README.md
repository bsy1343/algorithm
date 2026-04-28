# [Platinum I] Vjerojatnost - 14072

[문제 링크](https://www.acmicpc.net/problem/14072)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 구현, 수학, 확률론

### 문제 설명

<p>Mali Perica odu&scaron;evljen je novom računalnom igrom &quot;Slovčeka&quot;. U toj je igri na dnu ekrana niz od n (početno praznih) polja, a na vrhu ekrana redom se pojavljuju nezavisno slučajno odabrana slova iz skupa {A, B, C, D}. Čim se pojavi neko slovo, Perica ga treba smjestiti u neko polje niza koje je jo&scaron; uvijek prazno. Igra zavr&scaron;ava kada su sva polja popunjena, a Peričin cilj je da slova u popunjenom nizu budu poredana uzlazno po abecedi.</p>

<p>Znajući vjerojatnosti pojavljivanja slova A, B, C i D na ekranu, izračunajte vjerojatnost da će Perica, igraju ći optimalno, uspjeti ostvariti cilj igre.</p>

### 입력

<p>U prvom redu nalazi se prirodni broj n (n &le; 250) &mdash; broj polja u nizu, ujedno i broj padajućih slova.</p>

<p>U drugom redu nalaze se cijeli brojevi a, b, c, d (0 &le; a, b, c, d &le; 100, a + b + c + d = 100) &mdash; postotne vjerojatnosti pojavljivanja slova A, B, C, D redom.</p>

### 출력

<p>U prvi i jedini red ispi&scaron;ite traženu vjerojatnost.</p>

<p>Tolerirat će se apsolutno i relativno odstupanje od službenog rje&scaron;enja za 10<sup>&minus;6</sup> .</p>