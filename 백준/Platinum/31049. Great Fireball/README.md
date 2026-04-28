# [Platinum IV] Great Fireball - 31049

[문제 링크](https://www.acmicpc.net/problem/31049)

### 성능 요약

시간 제한: 18 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 30.769%

### 분류

기하학, 스위핑, 매개 변수 탐색

### 문제 설명

<p>In a land far away, lost to time, a lone village fights to defend itself against hordes of invading orcs. There are $N$ orcs scattered throughout the land. The $i$-th orc is at position $(x_ i, y_ i)$ on the Cartesian plane.</p>

<p>The heroic village is at position $(0, 0)$. Fortunately a great and powerful magician lives in the village and is willing to defend it with a massive fireball. Like all great powers, this too comes with great limitations. The fireball must have the village on its circumference (but it does not damage the village). The larger the radius of the fireball, the more energy the wizard must expend.</p>

<p>You think the land would be safe if a fireball can remove at least $K$ of the $N$ orcs. The wizard needs to know what radius of fireball to create. Orcs are removed if they are within the fireball or just on its edge.</p>

### 입력

<p>Input starts with a line containing two space separated integers $N$ and $K$, the total number of orcs and the number of orcs the fireball needs to cover. Following that are $N$ lines giving the integer coordinates $x_ i$ and $y_ i$ of each orc. No two orcs are at the same position, and no orc is in the village (at $(0,0)$). The limits on the input are $1 \le N \le 100\, 000$, $1 \le K \le N$, and $|x_ i|, |y_ i| \le 1\, 000$.</p>

### 출력

<p>If it is impossible for any fireball of finite radius to cover $K$ orcs, print $-1$. Otherwise, print a single real number, the minimum radius of a fireball that contains $(0, 0)$ on its circumference that also covers at least $K$ orcs. Your answer is considered correct if it has an absolute or relative error of at most $10^{-4}$.</p>