# [Platinum IV] Booming Business - 14989

[문제 링크](https://www.acmicpc.net/problem/14989)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 31, 맞힌 사람: 26, 정답 비율: 68.421%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>You are an expert in bonsai, the Japanese art of cultivating small trees in small containers. Every year, you win the Bonsai Association&rsquo;s Pruning Competition (BAPC). With all this talent, it would be a shame not to turn your hobby into your job. Recently, you have rented a small store where you will sell your creations. Now you need to make a window display to draw in customers. Of course, you would like to grow the most impressive tree that will fit the window, but the window is only so tall, and the floor of the display can only bear so much weight. Therefore, you want a tree that is exactly so tall and so heavy that it can fit in your window.</p>

<p>Being an expert, you know that by definition a bonsai tree consists of a single branch, with 0 or more smaller bonsai trees branching off from that branch.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14989.%E2%80%85Booming%E2%80%85Business/fad99896.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14989/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:136px; width:386px" /></p>

<p style="text-align: center;">Figure 1: Four distinct examples of bonsai trees.</p>

<p>The height and weight of a bonsai tree can be carefully determined. A tree&rsquo;s weight is equal to the number of branches that appear in it. The weights of the trees in Figure 1 are 1, 4, 6 and 6, respectively. A tree&rsquo;s height is equal to the length of the longest chain of branches from the root to the top of the tree. The heights of the trees in Figure 1 are 1, 2, 3 and 3, respectively.</p>

<p>To make the most use of your window, you want to produce a bonsai tree of the precise height and weight that it can support. To get an idea of the number of options available to you, you would like to know how many different trees you could possibly grow for your store. Given a height and a weight, can you determine the number of trees with exactly that height and weight? Because the number may be very large, you may give your answer modulo 1,000,000,007.</p>

### 입력

<p>A single line containing two integers, h and w, with 1 &le; h, w &le; 300.</p>

### 출력

<p>Output a single line containing a single integer, the number of bonsai trees of height h and weight w, modulo 10<sup>9</sup> + 7.</p>