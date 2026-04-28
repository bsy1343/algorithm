# [Gold IV] Team Work - 4846

[문제 링크](https://www.acmicpc.net/problem/4846)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 83, 정답: 29, 맞힌 사람: 10, 정답 비율: 21.277%

### 분류

백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>A certain programming contest coach is frustrated with the lack of team work in his teams. He decided to demonstrate to his students the importance of team work by using the following well&minus;known analogy: it is very easy to take a single piece of stick and snap it into two halves. But if you bundle three sticks together (i.e. the three members of the team) you now have to apply a lot more force to snap the sticks. The coach is certain that his teams will understand the importance of team work after this demonstration.</p>

<p>So the coach went out to the forest to collect the sticks. The coach knows that a demonstration should always be rehearsed to debug any problems. He ensures that it is practically impossible to snap three sticks bundled together and that it is very easy to snap individual sticks. Oh no! Every stick he has carefully collected snapped into smaller pieces. He can go out to collect more sticks, but how would he know that the sticks would work with the demonstration?</p>

<p>The coach came up with a clever idea: just glue the pieces back together to form larger sticks! It appears that every piece can be glued together securely with any other piece even if the two pieces came from different sticks originally. Thus, he can reconstruct sticks by putting two or more pieces together. The reconstructed sticks have the added advantage that each individual stick is really easy to snap at the connection point. However, if two sticks have a connection point at the same location, the two sticks will snap just as easily when bundled together. Therefore, he must reconstruct three sticks in such a way that none of the connection points coincide. Furthermore, it is desirable for the reconstructed sticks to be as long as possible. Finally, the three reconstructed sticks must have the same length&minus;&minus;&minus;the coach does not want to imply that one team member is better than another. It is acceptable to leave some pieces unused. Each piece can only be used once, of course.</p>

### 입력

<p>The input consists of a number of cases. Each case is specified on one line. The first number specifies the number of pieces (N). Each of the following N numbers is a positive integer specifying the length of each piece. There are at most 13 pieces, and the length of each piece is at most 25. The end of input is specified by a case in which N = 0.</p>

### 출력

<p>For each case, print the case number followed by a colon, followed by the longest possible length of the three reconstructed sticks on a single line. If it is impossible to reconstruct three sticks satisfying the constraints stated, then 0 is the longest possible length of the reconstructed sticks.</p>