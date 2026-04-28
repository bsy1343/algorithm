# [Gold I] That’s One Hanoi-ed Teacher - 15075

[문제 링크](https://www.acmicpc.net/problem/15075)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 12, 맞힌 사람: 10, 정답 비율: 50.000%

### 분류

구현, 수학, 재귀, 시뮬레이션

### 문제 설명

<p>Roberta Roberts (the older sister of Bobby in Problem F) teaches math at a small college, and has just introduced the Tower of Hanoi to the students in her Discrete Math class. In case you&rsquo;ve been in a Tibetan monastery for the past several years and have never heard of the Tower of Hanoi puzzle (doubtful for several reasons), here&rsquo;s a brief description. The puzzle consists of three pegs, and n disks with radii of 1, 2, . . . , n. The initial set up has all the disks on a start peg in increasing order of their size from top to bottom, forming a pyramid. The object of the puzzle is to move all of these disks to a destination peg using the following rules:</p>

<ol>
	<li>You can move only one disk at a time</li>
	<li>At no point may a larger disk lie on top of a smaller disk</li>
</ol>

<p>It&rsquo;s well known that the optimal (i.e., shortest) solution for a Tower of Hanoi puzzle with n disks involves 2<sup>n</sup> &minus; 1 moves. The optimal solution for n = 3 is shown below (where the start peg is the leftmost peg and the destination peg is the rightmost peg):</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15075.%E2%80%85That%E2%80%99s%E2%80%85One%E2%80%85Hanoi-ed%E2%80%85Teacher/c8eb361f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15075/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:177px; width:650px" /></p>

<p style="text-align:center">Figure G.1</p>

<p>As part of an in-class lab, Roberta will hand out Tower of Hanoi sets to her students and let them try to solve the problem on their own. As she goes around the room, she realizes that for the larger size sets, she has trouble looking at a current layout of the disks and determining whether the student is on the right track or not. In other words, she wishes to know whether or not a given configuration of the puzzle is one of the 2<sup>n</sup> configurations in the optimal solution sequence. She would also like to be able to tell her students how close they are to the final configuration (i.e., all the disks in increasing sizes, top to bottom, on the destination peg). Needless to say, this has caused her a bit of consternation, so she has come to you for help.</p>

### 입력

<p>Input consists of three lines, each line representing one peg of a Tower of Hanoi configuration. Each of these lines starts with a non-negative integer m indicating the number of disks on that peg,&nbsp;followed by m integers indicating the disks, starting with the disk on the bottom of the peg. The first line refers to the start peg and the last line refers to the destination peg. Disks are numbered consecutively starting at 1 with each number indicating the disk&rsquo;s radius. All disk numbers used form a consecutive sequence. The maximum number of disks in any test case is 50.</p>

### 출력

<p>Display No if the given configuration is not in the optimal solution sequence; otherwise display the minimum number of remaining moves required to get to the final configuration.</p>