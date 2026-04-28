# [Platinum IV] Strange Billboard - 3436

[문제 링크](https://www.acmicpc.net/problem/3436)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 23, 맞힌 사람: 19, 정답 비율: 55.882%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>The marketing and public-relations department of the Czech Technical University has designed a new reconfigurable mechanical Flip-Flop Bill-Board (FFBB). The billboard is a regular two-dimensional grid of R&times;C square tiles made of plastic. Each plastic tile is white on one side and black on the other. The idea of the billboard is that you can create various pictures by flipping individual tiles over. Such billboards will hang above all entrances to the university and will be used to display simple pictures and advertise upcoming academic events.</p>

<p>To change pictures, each billboard is equipped with a &rdquo;reconfiguration device&rdquo;. The device is just an ordinary long wooden stick that is used to tap the tiles. If you tap a tile, it flips over to the other side, i.e., it changes from white to black or vice versa. Do you agree this idea is very clever?</p>

<p>Unfortunately, the billboard makers did not realize one thing. The tiles are very close to each other and their sides touch. Whenever a tile is tapped, it takes all neighboring tiles with it and all of them flip over together. Therefore, if you want to change the color of a tile, all neighboring tiles change their color too. Neighboring tiles are those that touch each other with the whole side. All inner tiles have 4 neighbors, which means 5 tiles are flipped over when tapped. Border tiles have less neighbors, of course.</p>

<p><img alt="" src="/upload/images2/board.png" style="height:124px; width:382px" /></p>

<p>For example, if you have the billboard configuration shown in the left picture above and tap the tile marked with the cross, you will get the picture on the right. As you can see, the billboard reconfiguration is not so easy under these conditions. Your task is to find the fastest way to &rdquo;clear&rdquo; the billboard, i.e., to flip all tiles to their white side.</p>

### 입력

<p>The input consists of several billboard descriptions. Each description begins with a line containing two integer numbers R and C (1 &le; R, C &le; 16) specifying the billboard size. Then there are R lines, each containing C characters. The characters can be either an uppercase letter &ldquo;X&rdquo; (black) or a dot &ldquo;.&rdquo; (white). There is one empty line after each map. The input is terminated by two zeros in place of the board size.</p>

### 출력

<p>For each billboard, print one line containing the sentence &ldquo;You have to tap T tiles.&rdquo;, where T is the minimal possible number of taps needed to make all squares white. If the situation cannot be solved, output the string &ldquo;Damaged billboard.&rdquo; instead.</p>