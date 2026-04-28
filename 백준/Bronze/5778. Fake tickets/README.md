# [Bronze II] Fake tickets - 5778

[문제 링크](https://www.acmicpc.net/problem/5778)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 256, 정답: 182, 맞힌 사람: 164, 정답 비율: 71.930%

### 분류

구현

### 문제 설명

<p>Your school organized a big party to celebrate your team brilliant win in the prestigious, worldfamous ICPC (International Collegiate Poetry Contest). Everyone in your school was invited for an evening which included cocktail, dinner and a session where your team work was read to the audience. The evening was a success &ndash; many more people than you expected showed interested in your poetry &ndash; although some critics of yours said it was food rather than words that attracted such an audience.</p>

<p>Whatever the reason, the next day you found out why the school hall had seemed so full: the school director confided he had discovered that several of the tickets used by the guests were fake. The real tickets were numbered sequentially from 1 to N (N &le; 10000). The director suspects some people had used the school scanner and printer from the Computer Room to produce copies of the real tickets. The director gave you a pack with all tickets collected from the guests at the party&rsquo;s entrance, and asked you to determine how many tickets in the pack had &lsquo;clones&rsquo;, that is, another ticket with the same sequence number.</p>

### 입력

<p>The input contains data for several test cases. Each test case has two lines. The first line contains two integers N and M which indicate respectively the number of original tickets and the number of persons attending the party (1 &le; N &le; 10000 and 1 &le; M &le; 20000). The second line of a test case contains M integers Ti representing the ticket numbers in the pack the director gave you (1 &le; Ti &le; N). The end of input is indicated by N = M = 0.</p>

### 출력

<p>For each test case your program should print one line, containing the number of tickets in the pack that had another ticket with the same sequence number.</p>