# [Gold II] Knights of the Round Table - 10405

[문제 링크](https://www.acmicpc.net/problem/10405)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 18, 정답: 8, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

조합론, 수학, 순열 사이클 분할

### 문제 설명

<p>Every month King Arthur celebrates a High Council meeting. The K knights attending these meetings are known as The Knights of the Round Table, probably because they sit at a huge round oak table having K seats and a big throne with a sword and a stone carved in its back.</p>

<p>For today&rsquo;s meeting, each knight was given a number between 1 and K that indicates the seat he must take during the meeting. Seats are numbered clockwise from 1 to K, seat numbered 1 being the first to the left of the big throne. Obviously, the king himself was not given a number because he sits on the throne. King Arthur&rsquo;s squire made sure that no two knights got the same number so there should be no problems.</p>

<p>As usual, the king was the first to enter the council room today. According to the protocol rules, he sat on his throne and prepared to receive the K knights that must enter and sit one by one. After the first D knights arrived, the king noted that some of them could have sat on wrong seats, because they were distracted talking about who would win the next tournament. What a mess! King Arthur&rsquo;s squire promptly intervened and gave instructions to the remaining K &minus; D knights. Each of them must enter the council room and try to sit on his rightful seat; if his seat is already occupied, the knight must walk clockwise around the table and sit on the first unoccupied seat he finds. Thus, the final distribution of knights around the table depends on the order in which they enter the room.</p>

<p>King Arthur is now interested in knowing the number of distinct distributions of the K knights around the table given the seats occupied by the first D knights. Two distributions are considered distinct if there is at least one knight who sits on different seats in both distributions.</p>

<p>As the Royal Advisor in Combinatorics and other Mathematics (or Royal ACM) the task is assigned to you. You need to provide an answer within five hours at risk of loosing the king&rsquo;s favor. Hurry up!</p>

### 입력

<p>The first line contains two integers K (1 &le; K &le; 10<sup>6</sup>) and D (1 &le; D &le; 10<sup>5</sup>), representing respectively the number of knights and the number of distracted knights. Each of the next D lines describes a different distracted knight with two integers A and B (1 &le; A, B &le; K), indicating that the knight who was assigned seat A actually sat on seat B. It is granted that no two knights sat on the same seat.</p>

### 출력

<p>Output a line with an integer representing the number of distinct distributions of the K knights around the table. This number can be rather large so output the remainder of dividing it by 10<sup>9</sup> + 7.</p>