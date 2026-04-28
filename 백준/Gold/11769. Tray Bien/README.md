# [Gold III] Tray Bien - 11769

[문제 링크](https://www.acmicpc.net/problem/11769)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 13, 정답: 11, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Andr&eacute; Claude Marzipan is the head chef at the French restaurant Le Chaud Chien. He owns a vast number of baking trays, which come in two sizes: 1 foot by 1 foot, and 1 foot by 2 feet. He stores them along 3-foot deep shelves of various lengths. For example, on a shelf that is 5 feet long, he might store baking trays in either of the two ways shown below:</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11769/1.png" style="height:97px; width:304px" /></p>

<p style="text-align: center;">Figure G.1</p>

<p>Of course, there are many more than just these two ways, and in his off hours Andr&eacute; often wonders how many different ways he can place trays on a given shelf. Andr&eacute; is a bit of un maniaque du rangement (neat freak), so he insists that the trays are always aligned along the two axes defined by the shelf edges, that the edges of the trays are always 1 foot multiples away from any edge, and that no portion of a tray extends beyond the shelf. The matter is complicated by the fact that often there are locations on the shelf where he does not want to put any baking trays, due to leaks above the shelf, dents in the shelf&rsquo;s surface, etc. Since Andr&eacute; is more adept at cuisine than counting, he needs a little help.</p>

### 입력

<p>The input consists of two lines: the first line will contain two integers m n, where 1 &le; m &le; 24 indicates the length of the shelf (which is always 3-feet deep) and n indicates the number of bad locations on the shelf. The next line will contain n coordinate pairs x y indicating the locations where trays should not be placed, where 0 &lt; x &lt; m and 0 &lt; y &lt; 3. No location will have integer coordinates and coordinates are specified to the nearest hundredth. If n = 0, this second line will be blank.</p>

### 출력

<p>Output the number of ways that trays could be placed on the shelf.</p>