# [Platinum IV] Yes, Yes, It’s Nonograms - 15078

[문제 링크](https://www.acmicpc.net/problem/15078)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

백트래킹

### 문제 설명

<p>Nonograms (also known as Paint by Numbers or Hanjie) is a logic puzzle which encodes a blackand-white picture using sequences of numbers. The object of the puzzle is to recreate the picture from the numbers. The puzzle initially consists of a blank n &times; m grid, with a sequence of numbers associated with each row and each column. These numbers indicate the lengths of runs of black squares in a row (from left to right) or column (from top to bottom). For example, if the numbers for a row are 4 5 1 it indicates that somewhere in the row there is a run of 4 consecutive black squares followed later by a run of 5 consecutive black squares which is in turn followed by a run of a single black square. There must be 1 or more white spaces between each black run, and there can be 0 or more white squares before the first or after the last black run. In our example, if the length of a row is 13, then there are four possible layouts of black and white squares:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15078.%E2%80%85Yes%2C%E2%80%85Yes%2C%E2%80%85It%E2%80%99s%E2%80%85Nonograms/0fe363d6.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15078/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:98px; width:232px" /></p>

<p style="text-align:center">Figure J.1</p>

<p>Note that in all four of the possible layouts certain squares are always black, as shown in Figure J.2, while others can be either white or black (indicated by &lsquo;?&rsquo;)</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15078.%E2%80%85Yes%2C%E2%80%85Yes%2C%E2%80%85It%E2%80%99s%E2%80%85Nonograms/a6ad577f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15078/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:27px; width:231px" /></p>

<p style="text-align:center">Figure J.2</p>

<p>In fact, this is a major technique in solving Nonograms, since they not only help in filling black squares in a particular row (as above), but the black squares then constrain the possible layouts in the intersecting columns. This helps in filling in black squares in the columns, which in turn lead to more constraints on black squares in the rows, and so on. Similarly, we may sometimes deduce that certain tiles must be white, based solely on the sequence of runs for a given row or column and the colors of tiles in that row or column that were determined previously. For many puzzle instances, applying this approach repeatedly suffices to find a solution. In more complicated Nonograms, other methods need to be used as well, but for the purposes of this problem we will not only ignore these methods but insist that you use no technique other than the one described above.</p>

### 입력

<p>Input starts with a line containing two integers n m, where n is the number of rows in the grid and m is the number of columns (1 &le; n, m &le; 100). Following this are n lines each giving the sequence&nbsp;of numbers for a row, starting with the uppermost row. Each of these lines has the form p v<sub>1</sub> v<sub>2</sub> ... v<sub>p</sub>, where p is the number of values in the sequence, and v<sub>1</sub> ... v<sub>p</sub> is the sequence. After these n lines are m lines which describe the columns in a similar way, starting with the leftmost column. The Nonogram puzzle is guaranteed to have at least one arrangement of black and white squares consistent with all the sequences, which may or may not be fully discoverable with the technique described above.</p>

### 출력

<p>Display the most complete picture that can be constructed using only the technique described above. Your output should consist of n lines containing m characters each. Use an &lsquo;X&rsquo; for a black square, a &lsquo;.&rsquo; for a white square, and a &lsquo;?&rsquo; for a square that cannot be determined.</p>