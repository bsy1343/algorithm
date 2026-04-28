# [Platinum V] Blenjeel Sand Worms and Color Wriggles - 4472

[문제 링크](https://www.acmicpc.net/problem/4472)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 12, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

너비 우선 탐색, 비트마스킹, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>The Blenjeel sand worms slither across the sandy surface of the planet Blenjeel. As the planet&rsquo;s only known inhabits, they protect their homeland by attacking and devouring from underneath anyone who steps foot on their planet.</p>

<p>Of course, the sand worms need to be strong, flexible, and able to slither as quietly as possible. All teenage sand worms are conscripted to a six-month boot camp, where they endure intense training. The most demanding of the training exercise is the famous &quot;wriggle test&quot;, which requires worm cadets to slither from one position to a parallel position several hundreds of feet away. Only the toughest, most determined of worms survive.</p>

<p>The exercise is so famous that the Jedi Academy&rsquo;s CS101 has its students solve a puzzle based on Blenjeel Boot Camp. And that puzzle goes something like this:</p>

<p>Given an n &times; m board (3 &le; n &le; 6, 5 &le; m &le; 50) wriggle a Blenjeel sand worm (of length n) from the left column to the right column, ensuring the worm never simultaneously occupies two squares of the same color.</p>

<p>Consider the following 3 &times; 5 board, where each number represents a different color, and the worm is represented by the chain of circles:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4472.%E2%80%85Blenjeel%E2%80%85Sand%E2%80%85Worms%E2%80%85and%E2%80%85Color%E2%80%85Wriggles/70d0875d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4472/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:112px; width:170px" /></p>

<p>One of two possible moves is to pull the bottom of the worm to the right so it&rsquo;s positioned as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4472.%E2%80%85Blenjeel%E2%80%85Sand%E2%80%85Worms%E2%80%85and%E2%80%85Color%E2%80%85Wriggles/b16ed8b5.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4472/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:107px; width:172px" /></p>

<p>Now we can pull from the other end of the worm to carry it through three different positions:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4472.%E2%80%85Blenjeel%E2%80%85Sand%E2%80%85Worms%E2%80%85and%E2%80%85Color%E2%80%85Wriggles/2451f973.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4472/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:107px; width:573px" /></p>

<p>Through a series of additional moves, it&rsquo;s possible to wriggle the worm into the target position where the body of the worm is completely in the rightmost column:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4472.%E2%80%85Blenjeel%E2%80%85Sand%E2%80%85Worms%E2%80%85and%E2%80%85Color%E2%80%85Wriggles/f40f12be.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4472/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:102px; width:163px" /></p>

<p>It&rsquo;s acceptable for the worm to reach the right column in either orientation.</p>

<p>Your job is to write a program that reads in a series of boards as described above, and for each prints out the minimum number of wriggles needed to move the worm from the left column to the right (or -1 if there&rsquo;s no solution).</p>

### 입력

<p>The data will be n rows of m items. In each row will be digits representing a color (colors are represented by the digits 1 through 7 &ndash; not all boards will use all 7 colors). The colors in the leftmost column of each input board are guaranteed to be unique. Each board is separated from the next by a blank line. The end of input will be signaled by a standalone &lsquo;end&rsquo;. There will be a blank line between the last board and &lsquo;end&rsquo;.</p>

<p>&nbsp;</p>

### 출력

<p>For each board read, print the minimal number of wriggles needed to move the worm from the left column to the right (or -1 if there&#39;s no solution) followed by a newline.</p>