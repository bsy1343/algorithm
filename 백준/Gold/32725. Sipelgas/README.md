# [Gold IV] Sipelgas - 32725

[문제 링크](https://www.acmicpc.net/problem/32725)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 5, 맞힌 사람: 5, 정답 비율: 41.667%

### 분류

그래프 이론, 그래프 탐색, 애드 혹

### 문제 설명

<p>Robotsipelgas liigub mööda kuubi servi. Sipelgas peatub alati kuubi tipus ja ootab käsku: käsu <code>V</code> peale liigub ta järgmisse tippu mööda endast vasakul olevat serva, käsu <code>P</code> peale mööda paremal olevat serva.</p>

<p>Kirjutada programm, mis saab sipelga poolt seni täidetud käskude jada ja leiab sipelga jaoks lühima võimaliku tee tagasi tippu, kust ta liikumist alustas.</p>

### 입력

<p>Sisendi esimesel real on sipelga seni täidetud käskude arv $N$ ($0 \le N \le 1\,000$). Teisel real on $N$ tähte <code>V</code> ja <code>P</code>: nende käskude loend.</p>

### 출력

<p>Esimesele reale väljastada vähim käskude arv, millega saab sipelga suunata tagasi tippu, kust ta liikumist alustas. Teisele reale väljastada selleks vajalik käskude loetelu (ühe sõnena, ilma tühikute või muude eraldajateta). Kui minimaalse käskude arvuga teid lähtetippu on mitu, väljastada ükskõik milline neist.</p>