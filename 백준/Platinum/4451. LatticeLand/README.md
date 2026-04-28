# [Platinum III] LatticeLand - 4451

[문제 링크](https://www.acmicpc.net/problem/4451)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 13, 맞힌 사람: 11, 정답 비율: 24.444%

### 분류

구현, 그래프 이론, 그래프 탐색, 기하학, 너비 우선 탐색, 선분 교차 판정

### 문제 설명

<p>LeaperLad wakes in LatticeLand on a disk suspended above a lake of lava. Leaper spies his HeloPak on one of the disks; with it he knows he can escape this nefarious trap.</p>

<p>The disks are quite far apart, however; without some momentum, he can only jump to an immediately adjacent disk. Once he has acquired the speed to make that jump, he can accelerate on every disk he touches.</p>

<p>He notices the disks are laid out in a rectangular grid, with a disk on each grid point. He calculates that on each disk he can accelerate or decelerate his speed by one unit in the horizontal or vertical direction (but not both on the same disk). Alternatively, he can just maintain his speed when stepping on a disk. Thus, in a straight line, from a standing start, he can jump one unit, then two units, then three, then two, then one.</p>

<p>Some pairs of disks are joined by walls of fire that he knows he must not touch. He can get arbitrarily close to one of these walls, but he must not touch one. Nor can he fall off the edge of the grid.</p>

<p>How quickly can LeaperLad reach his HeloPak and stop on that disk?</p>

### 입력

<p>Input will have one problem per input line. The input line will contain a sequence of integers, each separated by a single space.</p>

<p>The first two integers will be w and h, the width and height of the grid. Each of these values will be between 1 and 64, inclusive. Following that will be two integers representing the coordinates of the disk that LeaperLad wakes on. After that will be two integers representing the coordinates of the disk that the HeloPak is on. The next integer will be f, the number of fire walls. There will be six or fewer fire walls. After that will be f sets of 4 integers, representing the two coordinates of the end points of the walls.</p>

<p>For all coordinates, the first number will be between 0 and w &minus; 1, inclusive, and the second number will be between 0 and h &minus; 1, inclusive. All fire walls will be at least one unit long. The HeloPak and LeaperLad will never start on the same disk, nor will either start on a disk that is on a firewall. There will always be a way for LeaperLad to reach his HeloPak.</p>

<p>There will be no more than 50 problems.</p>

### 출력

<p>For each input line, print a single integer indicating the minimal number of moves needed for LeaperLad to reach his HeloPack. Pay close attention to the first couple of examples; they clarify how moves are counted.</p>

### 힌트

<p>Example 1</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4451.%E2%80%85LatticeLand/ec932fd0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4451.%E2%80%85LatticeLand/ec932fd0.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4451/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:47px; width:102px" /></p>

<p>This requires two moves. In the first move, LeaperLad accelerates one unit in the positive x direction, and hops onto the destination disk. In the second move, he decelerates to the required speed of zero (note that although LeaperLad&rsquo;s position does not change during the second move, it nonetheless counts towards the total).</p>

<p>Example 2</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4451.%E2%80%85LatticeLand/30892323.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4451.%E2%80%85LatticeLand/30892323.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4451/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:92px; width:98px" /></p>

<p>This requires four moves. LeaperLad first moves to the right, as in the prior example, but he must decelerate in the x direction first, then accelerate in the y direction to jump down, then decelerate again to become motionless.</p>

<p>Example 3</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4451.%E2%80%85LatticeLand/58858191.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4451.%E2%80%85LatticeLand/58858191.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4451/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:86px; width:150px" /></p>

<p>This requires eight moves. LeaperLad cannot jump diagonally from a standing stop; he needs to back up to get some momentum first. So first he must move to position (0, 0), then decelerate to turn around, then accelerate in the x direction while jumping to his original location. His momentum allows him to accelerate in the y direction to make a diagnoal move. Once landing at his destination, he has one unit of momentum in both x and y directions, so he must decelerate, first in the y direction (which takes him to position (3, 1), overshooting his destination). Then he decelerates to turn around, jumps to his destination once more, and then decelerates to be motionless, for a total of eight moves.</p>

<p>Example 4</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4451.%E2%80%85LatticeLand/f8bc7107.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4451.%E2%80%85LatticeLand/f8bc7107.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4451/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:328px; width:328px" /></p>

<p>This requires 16 moves.</p>

<p>Example 5</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4451.%E2%80%85LatticeLand/9abc836a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4451.%E2%80%85LatticeLand/9abc836a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4451/5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:327px; width:335px" /></p>

<p>This requires 43 moves.</p>