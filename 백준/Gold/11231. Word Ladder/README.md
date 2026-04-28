# [Gold I] Word Ladder - 11231

[문제 링크](https://www.acmicpc.net/problem/11231)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 40, 정답: 7, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>A Word Ladder is a puzzle in which you transform one word into another, by changing one letter at a time. But, there&rsquo;s a catch: every word that you form in each step must be in the dictionary! Here&rsquo;s an example of how to transform CAT into GAS:</p>

<p>CAT-&gt;CAR-&gt;WAR-&gt;WAS-&gt;GAS</p>

<p>Of course, you want to use the fewest number of transitions possible. These puzzles can be tough, and often you&rsquo;ll think to yourself: &ldquo;Darn it! If only [some word] was in the dictionary!&rdquo;</p>

<p>Well, now is your chance! Given a dictionary, and a starting and ending word, what ONE single word could you add to the dictionary to minimize the number of steps to get from the starting word to the ending word, changing only one letter at a time, and making sure that every word at every step is in the dictionary?</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. Each test case will start with a line with a single integer n (2 &le; n &le; 1,000) which indicates the number of words in the dictionary. The dictionary will follow on the next n lines, with one word per line. All words will consist of between 1 and 8 capital letters only, and all of the words in a test case will be of the same length. The first word in the list will be the starting word of the word ladder, and the second will be the ending word of the word ladder.</p>

### 출력

<p>Output exactly two lines. The first line holds the one single word that you would add to the dictionary, and the second holds an integer indicating the minimum number of steps to get from the starting word to the ending word, adding your word. Output no spaces.</p>

<p>It is possible that there&rsquo;s more than one word you can add that will make your path as short as possible. In this case, output the solution word that comes first alphabetically.</p>

<p>It is possible that there&rsquo;s no word you can add that will that will make your path any shorter.</p>

<p>In this case, output 0 (zero) as the word. It is possible that there&rsquo;s no word you can add that makes the solution possible. In this case, output 0 (zero) as the word, and -1 as the number of steps.</p>