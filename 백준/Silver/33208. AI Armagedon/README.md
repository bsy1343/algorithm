# [Silver II] AI Armagedon - 33208

[문제 링크](https://www.acmicpc.net/problem/33208)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 48, 정답: 34, 맞힌 사람: 16, 정답 비율: 69.565%

### 분류

그리디 알고리즘

### 문제 설명

<p>Nakon što je umjetna inteligencija preuzela poslove svih informatičara i matematičara, Stjepan se zaposlio u trgovini s odjećom kako bi prehranio obitelj.</p>

<p>Jednog dana Stjepan je dobio zadatak da posloži novopridošle majice na već postojeće hrpe. U dućanu postoji $K$ vrsta majica (pa tako i hrpa). Stjepan će redom dobiti ukupno $N$ majica te svaku staviti na hrpu koja odgovara vrsti majice.</p>

<p>Stjepan sa sobom i dalje vjerno nosi matematičku skriptu sa zadacima u nadi da će se jednog dana njegove vještine opet pokazati korisnima. Problem nastaje u tome što Stjepan ne želi skriptu odložiti na pod kako se ne bi uprljala pa će je zato odložiti na neku od hrpa.</p>

<p>Svaki put kada Stjepan treba staviti majicu na hrpu na kojoj se nalazi skripta, mora premjestiti skriptu na neku drugu hrpu.</p>

<p>Stjepana psihički i fizički umara konstantno premještanje skripte te ne može prestati razmišljati: "Kad bih znao redoslijed kojim majice dolaze, mogao bih rjeđe premještati skriptu". Možete li pomoći Stjepanu riješiti ovaj problem?</p>

### 입력

<p>U prvom retku nalaze se dva prirodna broja: broj novih majici koje će pristići $N$ ($1 ≤ N ≤ 10^6$) i broj hrpa $K$ ($2 ≤ K ≤ 10^9$).</p>

<p>U svakom od sljedećih $N$ redaka nalazi se po jedan prirodni broj $a_i$ ($1 ≤ a_i ≤ K$), koji označava hrpu na koju treba staviti $i$-tu majicu. Brojevi su dani u redoslijedu kojim Stjepan dobiva majice.</p>

### 출력

<p>Program treba ispisati jedan prirodni broj – najmanji mogući broj premještanja skripte koje Stjepan mora napraviti tijekom postavljanja majica. Na početku skripta može biti postavljena na bilo koju hrpu.</p>

### 힌트

<p>Pojašnjenje prvog probnog primjera: Prije početka Stjepan može staviti skriptu na hrpu $1$ (ovo ne računamo kao premještanje). Zatim dok pristigne druga majica, on premjesti skriptu na hrpu $3$. Nakon toga, dok pristigne šesta majica, on premjesti skriptu natrag na hrpu $1$. Nije moguće postići manje premještanja, no ovo nije jedini način premještanja skripte.</p>