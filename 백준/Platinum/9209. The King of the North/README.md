# [Platinum I] The King of the North - 9209

[문제 링크](https://www.acmicpc.net/problem/9209)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 317, 정답: 86, 맞힌 사람: 67, 정답 비율: 25.769%

### 분류

그래프 이론, 최대 유량, 최대 유량 최소 컷 정리

### 문제 설명

<p>Winter is coming (or going? who can be sure these days) and a new king rises in the North. The message travels quickly these days... That is why you, the rising king, have not much time left. You need to rally your bannermen behind you. But one question seems harder to answer than you would have first expected. How large of a kingdom can you claim and how many men should you send for? Your advisors have taken a close look at the potential kingdom and have determined how many of your bannermen would be required to fully defend any part of the map against your foes. As you are a loving and caring king, you want to minimize the number of men that have to serve in your army. To give your war council a fair chance of figuring out the best kingdom to defend, you have to determine the size of the army that you will raise as soon as possible.</p>

<p>Luckily, armies are not that advanced yet. You will only have to defend against armies moving horizontally or vertically (an army cannot pass but your bannermen diagonally). Your kingdom counts as defended, if there is not a single way to reach your castle, starting anywhere outside of the map, without passing to a fully defended area. Squares on the map labeled 0 represent high mountains, or walls, no one would ever be foolish enough to climb. You can assume to be save from invasion without sending any bannermen to defend them. Since you are uncertain about what lurks behind the wall (or in our case the borders of the map), you have to assume the worst and plans as if you would never be able to hold any position outside of the given map.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9209.%E2%80%85The%E2%80%85King%E2%80%85of%E2%80%85the%E2%80%85North/4a991b86.png" data-original-src="https://www.acmicpc.net/upload/images/kingnorth.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:214px; width:247px" /></p>

<p style="text-align: center;"><strong>Figure 2</strong> &ndash; Illustration of the sample input &mdash; the kingdom can be defended with a minimal army of 37 bannerman, located at the cross-marked positions. The kingdom itself is illustrated using a tiling pattern. Note that you do not have to find out about the kingdom, or the position of you bannermen. These questions are to be figured out by your war council.</p>

### 입력

<p>The input is given in the form of the (rectangular) strategic map which your advisors came up with. Every square in map is assigned a number of bannermen which would be required to defend the position against any potential army. The map is formatted as follows: In a first line you are given to integers R and C, 3 &le; R, C &le; 300, specifying the dimensions of the map. This line is followed by R lines, each containing C integers 0 &le; c<sub>i</sub> &le; 100 000, the number of bannermen necessary to defend each square. Finally, you are given 0 &lt; r &lt; R - 1 and 0 &lt; c &lt; C - 1, the position of your own castle on the map.</p>

### 출력

<p>Output an integer on a single line, the smallest possible army you would require to defend any kingdom.</p>