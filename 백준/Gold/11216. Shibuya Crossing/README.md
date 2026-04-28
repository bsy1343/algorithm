# [Gold I] Shibuya Crossing - 11216

[문제 링크](https://www.acmicpc.net/problem/11216)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

방향 비순환 그래프, 다이나믹 프로그래밍, 그래프 이론, 위상 정렬

### 문제 설명

<p>The Shibuya scramble crossing in Tokyo is infamous for being heavily used, resulting in people bumping into each other. The crossing can be modeled as a convex polygon, where the n people about to cross initially stand at a point that is on the perimeter of the polygon and in its lower half. When the traffic lights change, each person starts to walk towards a unique point on the perimeter in the upper half of the polygon. The path each person takes may look like spaghetti (it may even cross itself), but it will never leave the polygon and no two paths will cross more than once.</p>

<p>Oskar who is a badass geek observes the crossing from the Starbucks nearby. He has numbered the people in the crossing consecutively 1 through n in counter-clockwise order (starting with the person at the very left). Sadly he doesn&rsquo;t know the intended paths of the people at the crossing, but he has gathered some intelligence telling him exactly which persons&rsquo; paths will cross one another (and this information is consistent with the physical reality).</p>

<p>Being a nerd he obviously knows about Murphy&rsquo;s Law saying &ldquo;Anything that can go wrong, will go wrong!&rdquo;. So all people who could possibly bump into each other, i.e., all people whose paths cross, will actually bump into each other! He now asks himself, &ldquo;After all the n people have crossed, what is the size of the largest group of people where everyone has bumped into each other?&rdquo;. Now that is a geeky and tough question, can you help him?</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11216/1.png" style="height:281px; width:324px" /></p>

<p style="text-align: center;">Figure E.1: A beautiful illustration of a possible interpretation of the first sample test case.</p>

### 입력

<p>The first line contains an integer 1 &le; n &le; 800, the number of people at the crossing, and an integer 0 &le; m &le; 10 000, the number of paths that will cross, i.e., intersect one another. The next m lines each contain two integers a and b, 1 &le; a &lt; b &le; n, meaning that the path taken by person a will cross the path taken by person b. (No pair will occur twice in the input.)</p>

### 출력

<p>Output a single integer giving the size of the largest group of people where everyone has bumped into one another.</p>