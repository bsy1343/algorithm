# [Gold IV] Lühisõnum 2 - 29954

[문제 링크](https://www.acmicpc.net/problem/29954)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 26, 맞힌 사람: 26, 정답 비율: 96.296%

### 분류

문자열, 브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Kosmoseuurimiskeskus on tuvastanud $N$ planeeti, mille nimed $S_i$ koosnevad k&otilde;ik v&auml;ikestest ladina t&auml;htedest. Keskuse teadurid arvavad, et kui m&otilde;nel neist planeetidest on m&otilde;istusega elu, siis nad vastavad s&otilde;numile, milles sisaldub nende planeedi nimi.</p>

<p>Kuna kosmiliste s&otilde;numite saatmine on kallis, on vaja koostada v&otilde;imalikult l&uuml;hike teade, mis sisaldab alams&otilde;nedena k&otilde;igi $N$ planeedi nimesid.</p>

<p>Tuletame meelde, et s&otilde;ne $s$ on s&otilde;ne $t$ alams&otilde;ne, kui s&otilde;ne $s$ on v&otilde;imalik saada s&otilde;ne $t$ algusest ja l&otilde;pust mingi hulga s&uuml;mbolite kustutamise teel.</p>

### 입력

<p>Sisendfaili esimesel real on planeetide arv $N$ ja j&auml;rgmisel $N$ real iga&uuml;hel &uuml;he planeedi nimi $S_i$.</p>

### 출력

<p>V&auml;ljundfaili ainsale reale v&auml;ljastada v&auml;ikestest ladina t&auml;htedest koosnev s&otilde;num, mis sisaldab alams&otilde;nedena k&otilde;iki sisendis antud planeetide nimesid.</p>