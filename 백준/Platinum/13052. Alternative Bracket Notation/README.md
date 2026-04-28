# [Platinum I] Alternative Bracket Notation - 13052

[문제 링크](https://www.acmicpc.net/problem/13052)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 18, 맞힌 사람: 15, 정답 비율: 78.947%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Balanced closed bracket or parenthesis statements are ones where each opening bracket is matched with a closed bracket later in the string.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13052.%E2%80%85Alternative%E2%80%85Bracket%E2%80%85Notation/ca87a4e4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13052.%E2%80%85Alternative%E2%80%85Bracket%E2%80%85Notation/ca87a4e4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13052/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:86px; width:191px" /></p>

<p>Notice how each closed parenthesis matches to the most recent unmatched open parenthesis.</p>

<p>Define an alternative bracket notation as follows: each bracket pair corresponds to a header in the form of &ldquo;start,end:&rdquo; where start and end are indices of the new string itself! The index start is the index of the character immediately after the &lsquo;:&rsquo;, and end is the index past the last header corresponding to the last bracket pair contained in this bracket pair. By taking a substring(start, end) of the new notation, you get an alternative bracket sequence describing all of the pairs of brackets contained by the brackets corresponding to the &ldquo;start,end:&rdquo;! Since an empty pair of brackets has nothing inside, in their header, start and end will be the same.</p>

<p>Each index takes up as many characters in the string as they do when they are base 10 numbers. (For example, the index 42 will take up 2 characters). The indices in the new string start from 0. All of the indices found in the alternative bracket notation string are absolute indices from the beginning of the new string.</p>

<p>Consider this parenthetical statement: <code>(())</code></p>

<p>Here is it, in our new, alternate bracket notation: <code>4,8:8,8:</code></p>

<p>In this example, there are two sets of matching parenthesis, the outer one and the inner one. The outer one appears before the inner one, since the start bracket appears first. So, the header for the outer brackets will appear before the header for the inner bracket. The header <code>4,8:</code> represents the outer bracket, while the header <code>8,8:</code> represents the inner bracket. The substring from the 4th character to 7th character is <code>8,8:</code>, which represents what is contained inside the outer bracket. Note that <code>5,11:11,11:</code> could also be a legitimate alternate notation, but we want the shortest one, which is why <code>4,8:8,8:</code> is the correct answer.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13052.%E2%80%85Alternative%E2%80%85Bracket%E2%80%85Notation/f10abdf9.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13052.%E2%80%85Alternative%E2%80%85Bracket%E2%80%85Notation/f10abdf9.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13052/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:64px; width:321px" /></p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. The input will consist of a single line, containing a string s, which consists only of open and closed parentheses. The string s will be between 2 and 4,000 characters long. There will be no spaces. The string s is guaranteed to be balanced.</p>

### 출력

<p>Output the string s in our new alternative bracket notation. If there&rsquo;s more than one way to represent s in the new notation, choose the shortest representation, which will be unique.</p>