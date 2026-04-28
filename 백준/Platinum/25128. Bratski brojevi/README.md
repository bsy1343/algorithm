# [Platinum II] Bratski brojevi - 25128

[문제 링크](https://www.acmicpc.net/problem/25128)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 13, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

조합론, 포함 배제의 원리, 수학, 뫼비우스 반전 공식, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Skup brojeva nazivamo <em>bratskim</em> ako postoji broj $p &gt; 1$ takav da $p$ dijeli sve brojeve tog skupa. Gospodin Malnar na poklon dobio je permutaciju $P$, brojeva od $1$ do $n$, koja je malo predugačka, stoga će zato od nje ostaviti samo prvih nekoliko brojeva.</p>

<p>Kako Gospodin Malnar obožava <em>bratske</em> skupove, zanima ga za svaki prefiks permutacije $P$ koliko sadrži nepraznih <em>bratskih</em> podskupova. Svi znamo da Gospodin Malnar ima važnijeg posla od brojanja podskupova, pa vas je zamolio da mu pomognete. Zato &scaron;to su ti brojevi preveliki, zanimaju ga samo modulo $998\,244\,353$.</p>

### 입력

<p>U prvom je retku prirodan broj $n$ ($1 &le; n &le; 3 &middot; 10^5$) iz teksta zadatka.</p>

<p>U sljedećem retku nalazi se n brojeva od kojih je $i$-ti $P_i$, tj. $i$-ti broj permutacije $P$.</p>

### 출력

<p>Potrebno je ispisati $n$ redaka. U $i$-tom retku potrebno je ispisati ostatak pri dijeljenju broja <em>bratskih</em> podskupova u prefiksu duljine $i$ s $998\,244\,353$.</p>