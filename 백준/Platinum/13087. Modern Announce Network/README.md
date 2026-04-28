# [Platinum III] Modern Announce Network - 13087

[문제 링크](https://www.acmicpc.net/problem/13087)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 12, 맞힌 사람: 12, 정답 비율: 44.444%

### 분류

그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>Today, modern teenagers use SNS to communicate with each other.</p>

<p>In a high school, N students are using an SNS called ICPC (International Community for Programming Contest). Some pairs of these N students are &quot;friends&quot; on this SNS, and can send messages to each other. Among these N students, A first grade students, B second grade students, and C third grade students are members of the Programming Society. Note that there may be some students who are not the members of the Programming Society, so A+B+C can be less than N.</p>

<p>There are good relationships between members of the same grade in the Society. Thus, there is a chat group in the SNS for each grade, and the Society members of the same grade can communicate with each other instantly via their group chat. On the other hand, the relationships between any different grades are not so good, and there are no chat group for the entire Society and the entire high school.</p>

<p>In order to broadcast a message to all the Society members on the SNS, the administrator of the Society came up with a method: the administrator tells the message to one of the N students and have them spread the message on the SNS via the chat groups and their friends. (The administrator itself does not have an account for the SNS.) As the members of the same grade can broadcast the message by the chat group for the grade, we can assume that if one of a grade gets the message, all other members of that grade also get the message instantly. Therefore, if the message is told to at least one member of each grade, we can assume that the message is broadcasted to the all members of the Society on the SNS.</p>

<p>Because it is bothering to communicate between friends, we want to minimize the number of communications between friends. What is the minimum number of communications between friends to broadcast a message to all the Society members? Who is the first person to whom the administrator should tell the message to achieve the minimum communications?</p>

### 입력

<p>The input consists of a single test case. The test case is formatted as follows:</p>

<pre>
N A B C
a<sub>1</sub> ... a<sub>A</sub>
b<sub>1</sub> ... b<sub>B</sub>
c<sub>1</sub> ... c<sub>C</sub>
M
x<sub>1</sub> y<sub>1</sub>
...
x<sub>M</sub> y<sub>M</sub></pre>

<p>The first line contains four integers N, A, B, and C. N (3 &le; N &le; 10,000) denotes the number of students in the SNS, and A, B and C (1 &le; A,B,C &le; N and A+B+C &le; N) denote the number of members of the first, second, and third grade respectively. Each student on the SNS is represented by a unique numeric ID between 1 and N. The second line contains A integers a<sub>1</sub>,⋯,a<sub>A</sub> (1 &le; a<sub>1</sub>,⋯,a<sub>A</sub> &le; N), which are the IDs of members of the first grade. The third line contains B integers b<sub>1</sub>,⋯,b<sub>B</sub> (1 &le; b<sub>1</sub>,⋯,b<sub>B</sub> &le; N), which are the IDs of members of the second grade. The fourth line contains C integers c<sub>1</sub>,⋯,c<sub>C</sub> (1 &le; c<sub>1</sub>,⋯,c<sub>C</sub> &le; N), which are the IDs of members of the third grade. You can assume that a<sub>1</sub>,⋯,a<sub>A</sub>,b<sub>1</sub>,⋯,b<sub>B</sub>,c<sub>1</sub>,⋯,c<sub>C</sub> are distinct. The fifth line contains an integer M (2 &le; M &le; 500,000). M denotes the number of pairs of students who are friends in the SNS. The i-th line of the following M lines contains two integers x<sub>i</sub> and y<sub>i </sub>(1 &le; x<sub>i</sub>,y<sub>i</sub> &le; N), which means the student with ID x<sub>i</sub> and the student with ID y<sub>i</sub> are friends in the SNS. You can assume that x<sub>i</sub>&ne;y<sub>i</sub> (1 &le; i &le; M), and (x<sub>i</sub>&ne;x<sub>j</sub> or y<sub>i</sub>&ne;y<sub>j</sub>) and (x<sub>i</sub>&ne;y<sub>j </sub>or y<sub>i</sub>&ne;x<sub>j</sub>) if i&ne;j (1 &le; i,j &le; M). You can also assume that a message can be delivered from any student to any student in the SNS via the friends and group chat.</p>

### 출력

<p>Output the minimum number of communications between friends (not including group chat) to broadcast a message among all the Society members, and the ID of the student to whom the administrator should tell the message in order to achieve the minimum number of communications, separated by a single space. If there are multiple students that satisfy the above constraints, output the minimum ID of such students.</p>

<p>&nbsp;</p>