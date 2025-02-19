# Quick Sort & Merge Sort Algorithm - Explanation & Steps

## 🔹 Quick Sort

### **Partition Step Tak Kya Hota Hai?**
#### **Pivot Selection:**
- Pivot ko **last index** ka element man lete hain (`arr[r]`).
- Ek pointer `i` rakhenge, jo initially `l - 1` pe rahega.

#### **Array Traversal (for loop ke through):**
- `j = l` se `r - 1` tak traverse karte hain.
- Agar `arr[j] < pivot`, to:
  - `i` ko **increase** karte hain.
  - `arr[i]` aur `arr[j]` ko **swap** karte hain.

#### **Pivot Ko Correct Position Pe Set Karna (Final Swap)**
Partition complete hone ke baad:
- `i` ka position **pivot ke sahi position** ke just **left** me hota hai.
- Isiliye **pivot ko `i+1` pe shift karna hota hai**.
- `swap(arr[i + 1], arr[r])` karke pivot ko apni **sahi jagah** par place kar dete hain.

#### **Final Partitioning Example**
Agar ham `arr = {10, 80, 30, 90, 40, 50, 70}` pe quick sort laga rahe hain:

##### **Step 1: Initial Setup**
```
Array: [10, 80, 30, 90, 40, 50, 70]
Pivot = 70 (last element)
i = -1
```

##### **Step 2: Traverse (Comparison & Swap)**
| j | arr[j] | Condition (arr[j] < pivot) | i (increment) | Swap (if needed) | Array after swap |
|---|--------|----------------------------|---------------|------------------|------------------|
| 0 | 10     | ✅ Yes                        | 0             | Swap(arr[0], arr[0]) | [10, 80, 30, 90, 40, 50, 70] |
| 1 | 80     | ❌ No                         | -             | -                | -                |
| 2 | 30     | ✅ Yes                        | 1             | Swap(arr[1], arr[2]) | [10, 30, 80, 90, 40, 50, 70] |
| 3 | 90     | ❌ No                         | -             | -                | -                |
| 4 | 40     | ✅ Yes                        | 2             | Swap(arr[2], arr[4]) | [10, 30, 40, 90, 80, 50, 70] |
| 5 | 50     | ✅ Yes                        | 3             | Swap(arr[3], arr[5]) | [10, 30, 40, 50, 80, 90, 70] |

##### **Step 3: Final Swap (Pivot in Place)**
- `i = 3`
- Swap `arr[i+1]` and `arr[r]`
  `Swap(arr[4], arr[6])`
  **Final Partitioned Array:**
  ```
  [10, 30, 40, 50, 70, 90, 80]
  ```
- Pivot `70` is now at its **correct position (index 4)**.

##### **Recursive Sorting**
1. **Left Subarray:** `[10, 30, 40, 50]` → Quick Sort recursively.
2. **Right Subarray:** `[90, 80]` → Quick Sort recursively.

Yeh process har partition ke liye repeat hoti hai jab tak **pure array me har element apni sahi jagah pe na aa jaye.** 🎯

---

## 🔹 Merge Sort

### **Merge Step Tak Kya Hota Hai?**
#### **Dividing The Array:**
- Merge sort **divide and conquer** approach use karta hai.
- Array ko recursively **2 halves me todte hain** jab tak single element na bache.

#### **Merging The Subarrays:**
- 2 sorted subarrays ko **merge** karna hota hai.
- **Left subarray:** `arr[l...m]` aur **Right subarray:** `arr[m+1...r]`.
- Do temporary arrays `L[]` aur `R[]` banate hain.

#### **Merging Process:**
- Dono subarrays ka first element compare karte hain.
- **Jo chhota hota hai**, usko merged array me dalte hain.
- Agar ek subarray khatam ho jaye, to doosre subarray ke bache elements direct dal dete hain.

##### **Final Merging Example:**
Agar ham `arr = {53, 62, 73, 82, 21, 82, 25}` pe merge sort laga rahe hain:

###### **Step 1: Divide the Array**
```
Left:  [53, 62, 73, 82]
Right: [21, 82, 25]
```

###### **Step 2: Recursive Sorting**
```
Left Sorted:  [53, 62, 73, 82]
Right Sorted: [21, 25, 82]
```

###### **Step 3: Merge the Sorted Arrays**
| L[]  | R[]  | Merged Array |
|------|------|--------------|
| 53   | 21   | [21]         |
| 53   | 25   | [21, 25]     |
| 53   | 82   | [21, 25, 53] |
| 62   | 82   | [21, 25, 53, 62] |
| 73   | 82   | [21, 25, 53, 62, 73] |
| 82   | 82   | [21, 25, 53, 62, 73, 82, 82] |

Final Sorted Array:
```
[21, 25, 53, 62, 73, 82, 82]
```

### **Recursive Sorting**
- **Left Subarray:** `[53, 62, 73, 82]` → Merge Sort recursively.
- **Right Subarray:** `[21, 82, 25]` → Merge Sort recursively.

Yeh process har partition ke liye repeat hoti hai jab tak **pure array me har element apni sahi jagah pe na aa jaye.** 🎯

