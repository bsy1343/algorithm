# [Gold II] KenKen You Do It? - 11765

[문제 링크](https://www.acmicpc.net/problem/11765)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 37, 정답: 3, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

다이나믹 프로그래밍, 백트래킹

### 문제 설명

<p>KenKen is a popular logic puzzle developed in Japan in 2004. It consists of an n &times; n grid divided up into various non-overlapping sections, where each section is labeled with an integer target value and an arithmetic operator. The object is to fill in the entire grid with the numbers in the range 1 to n such that</p>

<ul>
	<li>no number appears more than once in any row or column</li>
	<li>in each section you must be able to reach the section&rsquo;s target using the numbers in the section and the section&rsquo;s arithmetic operator</li>
</ul>

<p>For this problem we are only interested in single sections of a KenKen puzzle, not the entire puzzle. Two examples of sections from an 8 &times; 8 KenKen puzzle are shown below along with some of their possible assignments of digits.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11765.%E2%80%85KenKen%E2%80%85You%E2%80%85Do%E2%80%85It%3F/5f83c487.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/11765.%E2%80%85KenKen%E2%80%85You%E2%80%85Do%E2%80%85It%3F/5f83c487.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11765/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:157px; width:535px" /></p>

<p style="text-align:center">Figure C.1</p>

<p>Note that while sections labeled with a subtraction or division operator can consist of only two grid squares, those labeled with addition or multiplication can have any number. Also note that in a 9 &times; 9 puzzle the first example would have two more solutions, each involving the numbers 9 and 2. Finally note that in the first solution of the second section you could not swap the 1 and 4 in the first row, since that would result in two 1&rsquo;s in the same column.</p>

<p>You may be wondering: for a given size KenKen puzzle and a given section in the puzzle, how many valid ways are there to fill in the section? Well, stop wondering and start programming!</p>

### 입력

<p>The input will start with a single line of the form n m t op, where n is the size of the KenKen puzzle containing the section to be described, m is the number of grid squares in the section, t is the target value and op is either &lsquo;+&rsquo;, &lsquo;-&rsquo;, &lsquo;*&rsquo; or &lsquo;/&rsquo; indicating the arithmetic operator to use for the section.</p>

<p>Next will follow m grid locations of the form r c, indicating the row and column number of the grid square. These grid square locations will take up one or more lines.</p>

<p>All grid squares in a given section will be connected so that you can move from any one square in the section to any other by crossing shared lines between grid squares.</p>

<p>The values of n, m and t will satisfy 4 &le; n &le; 9, 2 &le; m &le; 10, 0 &lt; t and 1 &le; r, c &le; n.</p>

### 출력

<p>Output the number of valid ways in which the section could be filled in for a KenKen puzzle of the given size.</p>