# [Silver II] Rainbow Strings - 18007

[문제 링크](https://www.acmicpc.net/problem/18007)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 156, 정답: 107, 맞힌 사람: 95, 정답 비율: 73.077%

### 분류

수학, 문자열, 조합론

### 문제 설명

<p>Define a <em>Rainbow String</em> as a string where every letter in the string is distinct. The empty string is a <em>Rainbow String</em>.</p>

<p>Given a string of lower-case letters, compute the number of different subsequences which are <em>Rainbow Strings</em>. Two subsequences are different if letter at a <em>specific position</em> is included in one subsequence but not the other. Thus, two different subsequences may result in the same string.</p>

<p>For example, consider the string <code>aab</code>. The following six subsequences (in bold and underlined) are the only Rainbow Strings in <code>aab</code>:</p>

<p style="text-align: center;"><code><u><strong>a</strong></u>ab a<u><strong>a</strong></u>b aa<u><strong>b</strong></u> <u><strong>a</strong></u>a<u><strong>b</strong></u> a<u><strong>ab</strong></u> <u><strong>&lt;empty&gt;</strong></u></code></p>

<p>The answer may be large, so output the answer modulo 11092019.</p>

### 입력

<p>The single line of input contains a string <em>s</em> (1 &le; |<em>s</em>| &le; 10<sup>5</sup>) which consists only of lower-case letters.</p>

### 출력

<p>Output a single integer, which is the number of subsequences of <em>s</em> which are <em>Rainbow Strings</em>.</p>