# [Gold I] One Nail / One Hole - 33658

[문제 링크](https://www.acmicpc.net/problem/33658)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

애드 혹, 자료 구조, 집합과 맵, 해 구성하기

### 문제 설명

<p>Patak and Parsa are two brothers living in Edmonton. Like all good brothers, they love annoying each other. But Patak has a special quirk: he is obsessed with the number $2$. Not just a little—he worships it. If something isn’t divisible by $2$, it doesn’t deserve to exist in his world.</p>

<p>On the 2nd day of the 2nd month of the year $2222$ (a day Patak considers sacred), he went out and bought $N$ identical sheets of paper, each with a length of $L$ and a width of $W$. Of course, being the number $2$ fanatic he is, he made sure that $N$, $L$, and $W$ were all divisible by $2$.</p>

<p>Once he got home, he carefully glued the sheets onto the wall in a perfect arrangement, making sure every paper was leveled and in landscape orientation. Naturally, all the corner coordinates of these sheets were also divisible by $2$ (considering the bottom-left corner of the wall to be the origin of his coordinate system). Patak went to bed that night feeling accomplished, excited to wake up the next day and paint beautiful designs on his perfectly aligned papers.</p>

<p>But Parsa, being the mischievous brother he is, saw an opportunity. He knew that if Patak worshiped the number $2$, then he must absolutely despise the number $1$. And what better way to make him suffer than by introducing the number $1$ into his perfect world?</p>

<p>So Parsa came up with a plan. He went to the hardware store, bought exactly $N$ nails and $1$ hammer. His plan was simple but devastating—he would hammer at most $N$ nails into the wall in a way that each paper had exactly one hole in it. And, of course, he had to do it in the most perfect way so that this criterion held for all the papers without exception, maximizing Patak’s agony.</p>

<p>But there was a problem. Placing the nails randomly wouldn’t do the job because there were many overlaps between the papers, and one nail could make a hole in multiple sheets. The plan had to be flawless. So, Parsa needs your help! Can you find the coordinates where he should place the $n$ nails so that each sheet gets exactly one hole and Patak’s dreams of a perfect painting are completely shattered?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33658.%E2%80%85One%E2%80%85Nail%E2%80%85%EF%BC%8F%E2%80%85One%E2%80%85Hole/d78e393c.png" data-original-src="https://boja.mercury.kr/assets/problem/33658-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 228px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: Illustration of the 3rd sample input and output. Note, there are two papers with lower-left corner $(2,2)$ but only one can be seen in the figure.</p>

### 입력

<p>The first line of input contains three integers $N$, $L$, $W$ ($2≤N≤2\,222$ and $2≤L,W≤222\,222\,222$) as defined in the problem. Then $N$ lines follow, the $i$’th containing two integers $x_i$, $y_i$ ($2≤x_i,y_i≤222\,222\,222$) describing lower-left corner of the $i$’th paper. Additionally, every integer in the input (i.e. $N$, $L$, $W$ and all $(x_i,y_i)$ coordinate values) will be divisible by $2$ (the perfect world of Patak!).</p>

### 출력

<p>The first line of output should be a value $K$ describing the number of nails to be used in your solution. Then $K$ lines follow, each with a pair of integers $x'_j$, $y'_j$ describing the coordinates of a nail. All $K$ coordinates $(x'_1,y'_1),(x'_2,y'_2),\dots ,(x'_K,y'_K)$ must be distinct. Additionally, the output values must satisfy $1≤K≤N$ and $2≤x'_j,y'_j≤444\,444\,444$ for each $1≤j≤K$. However, the coordinate values of the nails are permitted to be odd (not the perfect world of Patak).</p>

<p>Each paper should be pierced by exactly one nail. Note, if a nail is on the edge or corner of a paper then it is considered to pierce that paper and make a hole on it. A nail is not required to pierce any papers (but why do so?!).</p>