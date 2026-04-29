# [Bronze II] Sõnasnäki lahendamine - 32729

[문제 링크](https://www.acmicpc.net/problem/32729)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 102, 정답: 74, 맞힌 사람: 59, 정답 비율: 75.641%

### 분류

구현, 문자열

### 문제 설명

<p>Sõnasnäkk on mäng, kus tuleb etteantud tähtedest sõnu moodustada.</p>

<p>Kirjuta sõnasnäki lahendamiseks abiprogramm, mis kasutada olevate tähtede loendi ja lubatud sõnade loendi põhjal leiab, milliseid lubatud sõnu saab kasutada olevatest tähtedest moodustada.</p>

### 입력

<p>Sisendi esimesel real on kasutada olevate tähtede loend: $1$ kuni $100\,000$ inglise tähestiku väiketähte ('<code>a</code>' kuni '<code>z</code>').</p>

<p>Teisel real on lubatud sõnade arv $N$ ($1 \le N \le 10\,000$).</p>

<p>Järgmisel $N$ real on igaühel üks lubatud sõna: $1$ kuni $100\,000$ inglise tähestiku väiketähte.</p>

<p>On teada, et lubatud sõnade pikkuste summa ei ületa üheski testis $1\,000\,000$.</p>

### 출력

<p>Väljastada need sõnad sisendis antud loendist, mida saab moodustada sisendi esimesel real antud tähtedest. Sõnad väljastada igaüks eraldi reale nende sisendis esinemise järjekorras.</p>